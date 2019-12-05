package com.bevbot.bartender.api.drink;

import io.eventuate.EntityWithIdAndVersion;

public interface DrinkService {

    EntityWithIdAndVersion<DrinkOrder> createOrder(String customerId, String drinkName, Money orderTotal);
}
