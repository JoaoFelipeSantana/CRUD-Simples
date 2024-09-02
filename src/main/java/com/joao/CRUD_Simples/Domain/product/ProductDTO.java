package com.joao.CRUD_Simples.Domain.product;


import java.util.Date;

public record ProductDTO(String name, String supplier, Date dt_validity, Date dt_manufacture, int amount) {

}
