package com.amdocs.Food.order.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name= "product")
public class Product {

    @Id
    @Column(
            name = "id"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;

    @Id
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "name")
    private String productName;

    @Column(name = "price")
    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryId;

}
