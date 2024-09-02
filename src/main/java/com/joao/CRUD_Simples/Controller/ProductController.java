package com.joao.CRUD_Simples.Controller;

import com.joao.CRUD_Simples.Domain.product.Product;
import com.joao.CRUD_Simples.Domain.product.ProductDTO;
import com.joao.CRUD_Simples.Domain.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    @Autowired ProductRepository repository;

    @GetMapping
    public ResponseEntity getAllProduct() {
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity registerProduct(@RequestBody ProductDTO data) throws ParseException {
        Product newProduct = new Product(data);
        repository.save(newProduct);
        return ResponseEntity.ok().build();
    }
}
