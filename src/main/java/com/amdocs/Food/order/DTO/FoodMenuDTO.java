package com.amdocs.Food.order.DTO;

import com.amdocs.Food.order.Entity.Category;
import com.amdocs.Food.order.Entity.Product;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodMenuDTO {

    private Integer foodType;
    private String foodItem;
    private List<Product> price;

    public FoodMenuDTO(Category menu) {
        this.foodType = menu.getCategoryId();
        this.foodItem = menu.getCategoryName();
        this.price = menu.getProducts();
    }

}
