package com.joao.CRUD_Simples.Domain.product;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name="product")
@Entity(name="product")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String supplier;
    private Date dt_validity;
    private Date dt_manufacture;
    private int amount;
    private boolean active;

}
