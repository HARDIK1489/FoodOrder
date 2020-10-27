package com.amdocs.Food.order.DTO;

import com.amdocs.Food.order.Entity.Product;
import com.amdocs.Food.order.Entity.UserCart;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCartDTO {

    private Long userId;
    private Long productId;
    private Integer quantity;

    public UserCartDTO(UserCart userCart) {

        this.userId = userCart.getUserId();
        this.productId = userCart.getProductId();
        this.quantity=userCart.getQuantity();

    }

}
