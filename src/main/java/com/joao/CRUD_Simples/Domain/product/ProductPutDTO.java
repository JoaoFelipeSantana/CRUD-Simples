package com.joao.CRUD_Simples.Domain.product;

public record ProductPutDTO( String id,
                             String name,
                             String supplier,
                             String dt_validity,
                             String dt_manufacture,
                             int amount
) {
}
