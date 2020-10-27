package com.amdocs.Food.order.dao.impl;

import com.amdocs.Food.order.Entity.Menu;
import com.amdocs.Food.order.Repository.FoodMenuRepository;
import com.amdocs.Food.order.dao.FoodMenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodMenuDaoImpl implements FoodMenuDao {

    @Autowired
    FoodMenuRepository foodMenuRepository;

   public Menu getFoodMenu(String foodType){

       return foodMenuRepository.findByFoodTypeAndIsActiveIsTrue(foodType);
    }
}
