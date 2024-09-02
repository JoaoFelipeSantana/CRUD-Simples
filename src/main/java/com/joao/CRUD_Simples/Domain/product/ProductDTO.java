package com.joao.CRUD_Simples.Domain.product;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public record ProductDTO(String name,
                         String supplier,

                         String dt_validity,

                         String dt_manufacture,
                         int amount) {

}
