//package com.amdocs.Food.order.Service;
//
//import com.amdocs.Food.order.DTO.FoodMenuDTO;
//import com.amdocs.Food.order.Entity.Menu;
//import com.amdocs.Food.order.Repository.CartRepository;
//import com.amdocs.Food.order.Repository.FoodMenuRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.List;
//
//public class FoodOrderServiceImpl implements FoodOrderService {
//
//    @Autowired
//    FoodMenuRepository foodMenuRepository;
//    @Autowired
//    CartRepository cartRepository;
//
//    @Override
//    public FoodMenuDTO getFoodMenu(String foodType){
//        Menu menu= foodMenuRepository.findByFoodTypeAndIsActiveIsTrue(foodType);
//        FoodMenuDTO.builder()
//    };
//
//    @Override
//    public String selectFoodItems(List<String> selectItems, Integer id){
//
//    };
//
//    @Override
//    public List<String> cartItems(Integer id){
//
//        return foodMenuRepository.showcartItems(id);
//    };
//
//    @Override
//    public List<String> placeOrder( Integer id){
//
//        return
//    };
//
//    @Override
//    public String cancelOrder( Integer id){
//
//
//    };
//
//    @Override
//    public String trackOrder( Integer id){};
//
//    @Override
//    public String addNewItem( String item){};
//}
