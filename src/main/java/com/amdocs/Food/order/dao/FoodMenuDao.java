package com.amdocs.Food.order.dao;

import com.amdocs.Food.order.Entity.Category;

public interface FoodMenuDao {

    Category getFoodMenu(String categoryName);
}
