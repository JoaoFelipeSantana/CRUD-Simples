package com.joao.CRUD_Simples.Controller;

import com.joao.CRUD_Simples.Domain.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProductController {

    @Autowired ProductRepository repository;

    @GetMapping
    public ResponseEntity getAllProduct() {
        var allProducts = repository.findAll();
        return ResponseEntity.ok(allProducts);
    }
}
