package com.amdocs.Food.order.Service;

import com.amdocs.Food.order.DTO.FoodMenuDTO;
import com.amdocs.Food.order.DTO.OrderTrackDTO;
import com.amdocs.Food.order.DTO.ProductDTO;
import com.amdocs.Food.order.DTO.UserCartDTO;

import java.util.List;

public interface FoodOrderService {

    FoodMenuDTO getFoodMenu(String categoryName);

    String addItemToCart(Long productId, Long userId, Integer quantity);

    List<UserCartDTO> cartItems(Long userId);

   String placeOrder(Long userId);

   String cancelOrder( Long userId);

    OrderTrackDTO trackOrder(Long userId);

    String addNewItem( ProductDTO newProductInfo);

}
