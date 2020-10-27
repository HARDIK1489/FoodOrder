package com.amdocs.Food.order.Repository;

import com.amdocs.Food.order.Entity.Menu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodMenuRepository extends CrudRepository<Menu,String>{

    Menu findByFoodTypeAndIsActiveIsTrue(String foodType);

}
