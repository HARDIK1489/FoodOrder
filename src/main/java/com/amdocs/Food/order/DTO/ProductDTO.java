package com.amdocs.Food.order.DTO;

import com.amdocs.Food.order.Entity.Category;
import com.amdocs.Food.order.Entity.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {

    private Long productId;
    private String productName;
    private double price;
    private Integer categoryId;

    public ProductDTO(Product product) {

        this.productId = product.getProductId();
        this.productName = product.getProductName();
        this.price = product.getPrice();
        this.categoryId = product.getCategoryId();

    }

}

