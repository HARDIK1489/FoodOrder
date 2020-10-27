package com.amdocs.Food.order.dao;

import com.amdocs.Food.order.Entity.Menu;

public interface FoodMenuDao {

    Menu getFoodMenu(String foodType);
}
