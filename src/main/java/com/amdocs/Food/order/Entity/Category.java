package com.amdocs.Food.order.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "category")
public class Category {

    @Id
    @Column(name = "id")
    private int categoryId;

    @Column(name = "name")
    private String categoryName;

    @OneToMany(mappedBy = "categoryId")
    private List<Product> products;

}
