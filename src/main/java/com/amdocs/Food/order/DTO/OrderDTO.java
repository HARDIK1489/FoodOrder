package com.amdocs.Food.order.DTO;

import com.amdocs.Food.order.Entity.Order;

import java.util.List;

public class OrderDTO {

    private Long orderId;
    private Long userId;
    private List<UserCartDTO> cartItems;
    private Double totalPrice;

    public OrderDTO(Order order){
        this.orderId=order.getOrderId();
        this.userId = order.getUserId();
        this.cartItems = order.getCartItems();
        this.totalPrice = order.getTotalPrice();
    }
}
