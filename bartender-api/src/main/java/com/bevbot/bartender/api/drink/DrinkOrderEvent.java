package com.bevbot.bartender.api.drink;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity = "com.bevbot.bartender.api.drink.DrinkOrder")
public interface DrinkOrderEvent extends Event {
}
