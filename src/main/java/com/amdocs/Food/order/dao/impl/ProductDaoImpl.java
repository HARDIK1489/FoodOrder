package com.amdocs.Food.order.dao.impl;

import com.amdocs.Food.order.Entity.Product;
import com.amdocs.Food.order.Repository.ProductRepository;
import com.amdocs.Food.order.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductDaoImpl implements ProductDao {

    @Autowired
    ProductRepository productRepository;

    public Product getProductDetails(Long productId) {

        return productRepository.findByProductIdAndIsActiveTrue(productId);
    }
}
