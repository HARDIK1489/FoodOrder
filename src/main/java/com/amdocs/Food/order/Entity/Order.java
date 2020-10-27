package com.amdocs.Food.order.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "order")
public class Order {

    @Id
    @Column(
            name = "id"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    @Column(
            name = "customerName",
            columnDefinition = "VARCHAR(11)"
    )
    private String customerName;

    @Column(
            name = "contactNumber",
            columnDefinition = "BIGINT(11)"
    )
    private Long contactNumber;

    @Column(
            name = "Order",
            columnDefinition = "VARCHAR(11)"
    )
    private List<String> order;

}
