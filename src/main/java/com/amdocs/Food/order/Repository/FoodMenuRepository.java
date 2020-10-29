package com.amdocs.Food.order.Repository;

import com.amdocs.Food.order.Entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodMenuRepository extends CrudRepository<Category,String>{

    Category findByNameAndIsActiveIsTrue(String categoryName);
}
