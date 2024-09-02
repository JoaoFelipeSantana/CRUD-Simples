package com.joao.CRUD_Simples.Domain.product;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository <Product, String> {
    List<Product> findAllByActiveTrue();
}
