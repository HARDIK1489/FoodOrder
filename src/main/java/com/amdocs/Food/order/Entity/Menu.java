package com.amdocs.Food.order.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.dom4j.tree.AbstractEntity;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "menu")
public class Menu extends AbstractEntity {

    @Id
    @Column(
            name = "id"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(
            name = "foodType",
            columnDefinition = "VARCHAR(11)"
    )
    private String foodType;

    @Column(
            name = "foodItem",
            columnDefinition = "VARCHAR(11)"
    )
    private String foodItem;

    @Column(
            name = "price",
            columnDefinition = "FLOAT(24)"
    )
    private Double price;

}
