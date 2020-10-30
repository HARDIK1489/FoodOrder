package com.amdocs.Food.order.DTO;

import com.amdocs.Food.order.Entity.Product;
import com.amdocs.Food.order.Entity.UserCart;
import com.amdocs.Food.order.Repository.ProductRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
public class UserCartDTO {

    @Autowired
    ProductRepository productRepository;

    private Long userId;
    private String productName;
    private Integer quantity;

    public UserCartDTO(UserCart userCart) {

        this.userId = userCart.getUserId();
        Product product = productRepository.findByProductIdAndIsActiveTrue(userCart.getProductId());
        this.productName = product.getProductName();
        this.quantity=userCart.getQuantity();

    }

}
