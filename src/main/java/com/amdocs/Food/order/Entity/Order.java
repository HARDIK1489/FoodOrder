package com.amdocs.Food.order.Entity;

import com.amdocs.Food.order.DTO.UserCartDTO;
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
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Long userId;

    @OneToMany(mappedBy = "orderId")
    private List<UserCartDTO> cartItems;

    @Column(name = "total_price")
    private Double totalPrice;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<UserCartDTO> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<UserCartDTO> cartItems) {
        this.cartItems = cartItems;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
