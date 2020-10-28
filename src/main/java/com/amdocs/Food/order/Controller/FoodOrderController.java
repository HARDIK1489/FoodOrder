package com.amdocs.Food.order.Controller;

import com.amdocs.Food.order.DTO.FoodMenuDTO;
import com.amdocs.Food.order.DTO.UserCartDTO;
import com.amdocs.Food.order.Entity.Category;
import com.amdocs.Food.order.Entity.Product;
import com.amdocs.Food.order.Entity.UserCart;
import com.amdocs.Food.order.Repository.CartRepository;
import com.amdocs.Food.order.dao.FoodMenuDao;
import com.amdocs.Food.order.dao.ProductDao;
import com.amdocs.Food.order.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/foodOrder")
public class FoodOrderController {

    @Autowired
    ProductDao productDao;

    @Autowired
    UserDao userDao;

    @Autowired
    CartRepository cartRepository;

    @Autowired
    FoodMenuDao foodMenuDao;

    @GetMapping(value = "/menu/{categoryName}")
    @ResponseBody
    public FoodMenuDTO getFoodMenu(@PathVariable("categoryName") String categoryName) {
        Category menu = foodMenuDao.getFoodMenu(categoryName);
        return new FoodMenuDTO(menu);
    }

    @PostMapping(value = "/addItemToCart")
    @ResponseBody
    public String addItemToCart(@RequestParam(value = "productId", required = true) Long productId,
                                @RequestParam(value = "userId", required = true) Long userId ,
                                @RequestParam(value = "quantity", required = true) Integer quantity)
    {

        Product product = productDao.getProductDetails(productId);

        if (product == null) {
            return "Product ID invalid";
        }

        UserCart userCart =new UserCart(userId,productId,quantity);
        cartRepository.save(userCart);

        return "Item Added To Cart";
    }

    @GetMapping(value = "/{userId}/cart")
    @ResponseBody
    public List<UserCartDTO> cartItems( @PathVariable("userId") Long userId)
    {
        List<UserCart> userCartList = userDao.getCartInfo(userId);

        List<UserCartDTO> userCartDTOS = null;
        for (UserCart userCart : userCartList)
        {
            UserCartDTO userCartDTO = new UserCartDTO(userCart);
            userCartDTOS.add(userCartDTO);
        }

        return userCartDTOS;
    }


    @GetMapping(value = "/placeOrder")
    @ResponseBody
    public String placeOrder(@RequestBody Integer id)
    {

    }

//    @GetMapping(value = "/cancelOrder")
//    @ResponseBody
//    public String cancelOrder( @RequestBody Integer id)
//    {
//
//        return foodOrderService.cancelOrder(id);
//    }
//
//    @GetMapping(value = "/trackOrder")
//    @ResponseBody
//    public String trackOrder( @RequestBody Integer id)
//    {
//
//        return foodOrderService.trackOrder(id);
//    }
//
//    @GetMapping(value = "/addNewItem")
//    @ResponseBody
//    public String addNewItem( @RequestBody String item)
//    {
//
//        return foodOrderService.addNewItem(item);
//    }

}
