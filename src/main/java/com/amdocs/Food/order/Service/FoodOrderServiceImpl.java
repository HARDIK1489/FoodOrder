package com.amdocs.Food.order.Service;

import com.amdocs.Food.order.DTO.FoodMenuDTO;
import com.amdocs.Food.order.DTO.OrderTrackDTO;
import com.amdocs.Food.order.DTO.ProductDTO;
import com.amdocs.Food.order.DTO.UserCartDTO;
import com.amdocs.Food.order.Entity.*;
import com.amdocs.Food.order.Repository.CartRepository;
import com.amdocs.Food.order.Repository.OrderRepository;
import com.amdocs.Food.order.Repository.OrderTrackRepository;
import com.amdocs.Food.order.Repository.ProductRepository;
import com.amdocs.Food.order.dao.FoodMenuDao;
import com.amdocs.Food.order.dao.OrderDao;
import com.amdocs.Food.order.dao.ProductDao;
import com.amdocs.Food.order.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodOrderServiceImpl implements FoodOrderService {

    @Autowired
    ProductDao productDao;

    @Autowired
    UserDao userDao;

    @Autowired
    CartRepository cartRepository;

    @Autowired
    FoodMenuDao foodMenuDao;

    @Autowired
    OrderDao orderDao;

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderTrackRepository orderTrackRepository;

    @Autowired
    ProductRepository productRepository;

    @Override
    public FoodMenuDTO getFoodMenu(String categoryName){
        Category menu = foodMenuDao.getFoodMenu(categoryName);
        return new FoodMenuDTO(menu);
    };

    @Override
    public String addItemToCart(Long productId, Long userId, Integer quantity){

        Product product = productDao.getProductDetails(productId);

        if (product == null) {
            return "Product ID invalid";
        }

        UserCart userCart =new UserCart(userId,productId,quantity);
        cartRepository.save(userCart);

        return "Item Added To Cart";
    };

    @Override
    public List<UserCartDTO> cartItems(Long userId){
        List<UserCart> userCartList = userDao.getCartInfo(userId);

        List<UserCartDTO> userCartDTOS = null;
        for (UserCart userCart : userCartList)
        {
            UserCartDTO userCartDTO = new UserCartDTO(userCart);
            userCartDTOS.add(userCartDTO);
        }

        return userCartDTOS;
    };

   @Override
    public String placeOrder( Long userId){

       List<UserCartDTO> userCartDTOS = this.cartItems(userId);

       if(userCartDTOS==null)
       {
           return " Cart EMPTY ";
       }

       return orderDao.placeOrder(userId);

    };

    @Override
   public String cancelOrder( Long userId){

        Order order = orderRepository.findByUserIdAndIsActiveTrue(userId);
        if (order == null)
        {
            return "order was not placed";
        }
        orderRepository.delete(order);
        return "Order Cancelled";

    };

    @Override
    public OrderTrackDTO trackOrder(Long userId) {

        Order order = orderRepository.findByUserIdAndIsActiveTrue(userId);
        if (order == null)
        {
            return null;
        }
        OrderTrackInfo orderTrackInfo =orderTrackRepository.findByOrderIdAndIsActiveTrue(order.getOrderId());
        OrderTrackDTO orderTrackDTO = new OrderTrackDTO(orderTrackInfo);
        return orderTrackDTO;
    };

    @Override
   public String addNewItem( ProductDTO newProductInfo){

        Product product = new Product() ;
        product.setProductName(newProductInfo.getProductName());
        product.setPrice(newProductInfo.getPrice());
        product.setCategoryId(newProductInfo.getCategoryId());
        productRepository.save(product);

        return "product added";
    };
}
