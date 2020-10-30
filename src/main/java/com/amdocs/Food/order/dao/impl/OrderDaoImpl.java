package com.amdocs.Food.order.dao.impl;

import com.amdocs.Food.order.DTO.UserCartDTO;
import com.amdocs.Food.order.Entity.Order;
import com.amdocs.Food.order.Entity.Product;
import com.amdocs.Food.order.Repository.OrderRepository;
import com.amdocs.Food.order.Repository.ProductRepository;
import com.amdocs.Food.order.Service.FoodOrderService;
import com.amdocs.Food.order.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderDaoImpl implements OrderDao {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    FoodOrderService foodOrderService;

    @Autowired
    ProductRepository productRepository;

    @Override
    public String placeOrder(Long userId){

        Order order =new Order();
        order.setUserId(userId);
        order.setCartItems( foodOrderService.cartItems(userId));
        Double totalPrize = 0D;
        for (UserCartDTO userCartDTO : order.getCartItems())
        {
            Product product = productRepository.findByNameAndIsActiveTrue(userCartDTO.getProductName());
            totalPrize+=product.getPrice();
        }
        order.setTotalPrice(totalPrize);
        orderRepository.save(order);
        return "Order Placed";

    };
}