package com.joao.CRUD_Simples.Domain.product;

import jakarta.persistence.*;
import lombok.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    public Product(ProductDTO data) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        this.name = data.name();
        this.supplier = data.supplier();
        this.dt_validity = format.parse(data.dt_validity());
        this.dt_manufacture = format.parse(data.dt_manufacture());
        this.amount = data.amount();
        this.active = true;
    }

}
