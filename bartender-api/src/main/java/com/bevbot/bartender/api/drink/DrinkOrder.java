package com.bevbot.bartender.api.drink;

import lombok.Builder;

@Builder
public class DrinkOrder {
    private String customerName;
    private String drinkName;
    private String orderId;
}
