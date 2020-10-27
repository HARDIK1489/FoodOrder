package com.amdocs.Food.order.Repository;

import com.amdocs.Food.order.Entity.UserCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<UserCart,Long> {

        List<UserCart> findByUserId(long userId);

}
