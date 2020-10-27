package com.amdocs.Food.order.Service;

import com.amdocs.Food.order.DTO.FoodMenuDTO;

import java.util.List;

public interface FoodOrderService {

    FoodMenuDTO getFoodMenu(String foodType);

    String selectFoodItems(List<String> selectItems, Integer id);

    List<String> cartItems(Integer id);

    List<String> placeOrder( Integer id);

    String cancelOrder( Integer id);

    String trackOrder( Integer id);

    String addNewItem( String item);

}
