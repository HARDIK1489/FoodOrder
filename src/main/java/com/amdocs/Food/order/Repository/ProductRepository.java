package com.amdocs.Food.order.Repository;

import com.amdocs.Food.order.Entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {

    Product findByProductIdAndIsActiveTrue(Long productId);
    Product findByNameAndIsActiveTrue(String productName);


}
