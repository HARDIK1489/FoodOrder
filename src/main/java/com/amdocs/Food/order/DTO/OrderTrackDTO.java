package com.amdocs.Food.order.DTO;

import com.amdocs.Food.order.Entity.OrderTrackInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderTrackDTO {

    private Long orderId;
    private String orderPlaced;
    private String orderOutForDelivery;
    private String orderDelivered;
    private String paymentReceived;

    public OrderTrackDTO(OrderTrackInfo orderTrackInfo)
    {
        this.orderId=orderTrackInfo.getOrderId();
        this.orderDelivered=orderTrackInfo.getOrderDelivered();
        this.orderPlaced = orderTrackInfo.getOrderPlaced();
        this.orderOutForDelivery = orderTrackInfo.getOrderOutForDelivery();
        this.paymentReceived = orderTrackInfo.getPaymentReceived();
    }
}
