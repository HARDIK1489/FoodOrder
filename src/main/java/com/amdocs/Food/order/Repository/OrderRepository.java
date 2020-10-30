package com.amdocs.Food.order.Repository;

import com.amdocs.Food.order.Entity.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order,Long> {

    Order findByUserIdAndIsActiveTrue(Long userId);

}
