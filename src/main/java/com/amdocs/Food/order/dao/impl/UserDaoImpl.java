package com.amdocs.Food.order.dao.impl;

import com.amdocs.Food.order.Entity.UserCart;
import com.amdocs.Food.order.Repository.CartRepository;
import com.amdocs.Food.order.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    CartRepository cartRepository;

    public List<UserCart> getCartInfo(Long userId) {
       return cartRepository.findByUserId(userId);
    }
}
