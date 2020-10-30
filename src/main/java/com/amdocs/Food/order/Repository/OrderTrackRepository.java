package com.amdocs.Food.order.Repository;

import com.amdocs.Food.order.Entity.OrderTrackInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderTrackRepository extends CrudRepository<OrderTrackInfo,Long> {

    OrderTrackInfo findByOrderIdAndIsActiveTrue(Long orderId);
}
