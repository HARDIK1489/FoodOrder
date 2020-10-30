package com.amdocs.Food.order.Controller;

import com.amdocs.Food.order.DTO.FoodMenuDTO;
import com.amdocs.Food.order.DTO.OrderTrackDTO;
import com.amdocs.Food.order.DTO.ProductDTO;
import com.amdocs.Food.order.DTO.UserCartDTO;
import com.amdocs.Food.order.Service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/foodOrder")
public class FoodOrderController {

    @Autowired
    FoodOrderService foodOrderService;

    @GetMapping(value = "/menu/{categoryName}")
    @ResponseBody
    public FoodMenuDTO getFoodMenu(@PathVariable("categoryName") String categoryName) {

        return foodOrderService.getFoodMenu(categoryName);
    }

    @PostMapping(value = "/addItemToCart")
    @ResponseBody
    public String addItemToCart(@RequestParam(value = "productId", required = true) Long productId,
                                @RequestParam(value = "userId", required = true) Long userId ,
                                @RequestParam(value = "quantity", required = true) Integer quantity)
    {
        return foodOrderService.addItemToCart(productId,userId,quantity);
    }

    @GetMapping(value = "/{userId}/cart")
    @ResponseBody
    public List<UserCartDTO> cartItems( @PathVariable("userId") Long userId)
    {
       return foodOrderService.cartItems(userId);
    }


    @GetMapping(value = "{userId}/placeOrder")
    @ResponseBody
    public String placeOrder( @PathVariable("userId") Long userId)
    {
      return foodOrderService.placeOrder(userId);
    }

    @GetMapping(value = "{userId}/cancelOrder")
    @ResponseBody
    public String cancelOrder( @PathVariable("userId") Long userId)
    {
        return foodOrderService.cancelOrder(userId);
    }

   @GetMapping(value = "{userId}/trackOrder")
   @ResponseBody
    public OrderTrackDTO trackOrder(@PathVariable("userId") Long userId)
   {
        return foodOrderService.trackOrder(userId);
   }

    @PutMapping(value = "/addNewItem")
    @ResponseBody
    public String addNewItem( @RequestBody ProductDTO newProductInfo)
    {
        return foodOrderService.addNewItem(newProductInfo);
    }

}
