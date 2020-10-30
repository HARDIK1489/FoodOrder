package com.amdocs.Food.order.dao;

import com.amdocs.Food.order.Entity.UserCart;

import java.util.List;

public interface UserDao {

        List<UserCart> getCartInfo(Long userId);
}
