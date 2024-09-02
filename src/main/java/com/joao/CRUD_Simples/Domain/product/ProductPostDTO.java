package com.joao.CRUD_Simples.Domain.product;


public record ProductPostDTO(String name,
                             String supplier,

                             String dt_validity,

                             String dt_manufacture,
                             int amount) {

}
