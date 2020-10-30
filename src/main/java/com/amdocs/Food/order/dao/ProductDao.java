package com.amdocs.Food.order.dao;

import com.amdocs.Food.order.Entity.Product;
import com.amdocs.Food.order.Entity.Category;

import java.util.List;

public interface ProductDao {

    public Product getProductDetails(Long productId);

//    public List<Category> getCategories();

}
