package com.amdocs.Food.order.DTO;

import com.amdocs.Food.order.Entity.Menu;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodMenuDTO {

    private String foodType;
    private String foodItem;
    private Double price;

    public FoodMenuDTO(Menu menu) {

        this.foodType = menu.getFoodType();
        this.foodItem = menu.getFoodItem();
        this.price = menu.getPrice();
    }

}
