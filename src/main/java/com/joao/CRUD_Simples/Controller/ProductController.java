package com.joao.CRUD_Simples.Controller;

import com.joao.CRUD_Simples.Domain.product.Product;
import com.joao.CRUD_Simples.Domain.product.ProductPostDTO;
import com.joao.CRUD_Simples.Domain.product.ProductPutDTO;
import com.joao.CRUD_Simples.Domain.product.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProductController {

    @Autowired ProductRepository repository;

    @GetMapping
    public ResponseEntity getAllProduct() {
        var allProducts = repository.findAllByActiveTrue();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody ProductPostDTO data) throws ParseException {
        Product newProduct = new Product(data);
        repository.save(newProduct);
        return ResponseEntity.ok(data);
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateProduct(@RequestBody ProductPutDTO data) throws ParseException {
        Optional<Product> optionalProduct = repository.findById(data.id());

        if (optionalProduct.isPresent()) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

            Product product = optionalProduct.get();

            product.setName(data.name());
            product.setSupplier(data.supplier());
            product.setDt_validity(format.parse(data.dt_validity()));
            product.setDt_manufacture(format.parse(data.dt_manufacture()));
            product.setAmount(data.amount());

            return ResponseEntity.ok(data);
        }
        throw new EntityNotFoundException();
    }

    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity deleteProduct(@PathVariable String id) {
        Optional<Product> optionalProduct = repository.findById(id);

        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            product.setActive(false);

            return ResponseEntity.noContent().build();
        }
        throw new EntityNotFoundException();
    }

}
