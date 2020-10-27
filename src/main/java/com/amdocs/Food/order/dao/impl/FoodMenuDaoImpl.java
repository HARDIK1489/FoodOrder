package com.amdocs.Food.order.dao.impl;

import com.amdocs.Food.order.Entity.Category;
import com.amdocs.Food.order.Repository.FoodMenuRepository;
import com.amdocs.Food.order.dao.FoodMenuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodMenuDaoImpl implements FoodMenuDao {

    @Autowired
    FoodMenuRepository foodMenuRepository;

   public Category getFoodMenu(String categoryName){

       return foodMenuRepository.findByCategoryNameAndIsActiveIsTrue(categoryName);
    }
}
