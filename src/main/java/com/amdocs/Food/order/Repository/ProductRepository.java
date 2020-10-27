package com.amdocs.Food.order.Repository;

import com.amdocs.Food.order.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {

    Product findByIdAndIsActiveTrue(Long productId);


}
