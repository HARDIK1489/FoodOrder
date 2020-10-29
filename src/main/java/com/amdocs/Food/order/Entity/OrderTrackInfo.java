package com.amdocs.Food.order.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "orderTrackInfo")
public class OrderTrackInfo {

    @Id
    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_placed")
    private String orderPlaced;

    @Column(name="order_out_for_delivery")
    private String orderOutForDelivery;

    @Column(name = "order_delivered")
    private String orderDelivered;

    @Column(name = "payment_received")
    private String paymentReceived;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(String orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public String getOrderOutForDelivery() {
        return orderOutForDelivery;
    }

    public void setOrderOutForDelivery(String orderOutForDelivery) {
        this.orderOutForDelivery = orderOutForDelivery;
    }

    public String getOrderDelivered() {
        return orderDelivered;
    }

    public void setOrderDelivered(String orderDelivered) {
        this.orderDelivered = orderDelivered;
    }

    public String getPaymentReceived() {
        return paymentReceived;
    }

    public void setPaymentReceived(String paymentReceived) {
        this.paymentReceived = paymentReceived;
    }


}
