package com.amdocs.Food.order.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="userCart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCart {

    @Id
    @Column(
            name = "order_id"
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer orderId;

    @Column(
            name = "user_Id",
            columnDefinition = "BIGINT(11)"
    )
    private Long userId;

    @Column(
            name = "productId",
            columnDefinition = "BIGINT(11)"
    )
    private Long productId;

    @Column(
            name = "quantity",
            columnDefinition = "INT(11)"
    )
    private Integer quantity;


    public UserCart(Long userId,Long productId, Integer quantity) {
        this.userId = userId ;
        this.productId = productId;
        this.quantity = quantity;
    }
}
