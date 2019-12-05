package com.bevbot.bartender.api.drink;

import io.eventuate.EntityWithIdAndVersion;
import io.eventuate.sync.AggregateRepository;

public class DrinkServiceImpl implements DrinkService {

  private final AggregateRepository<DrinkOrder, DrinkOrderCommand> orderRepository;

  public DrinkServiceImpl(AggregateRepository<DrinkOrder, DrinkOrderCommand> orderRepository) {
    this.orderRepository = orderRepository;
  }

  @Override
  public EntityWithIdAndVersion<DrinkOrder> createOrder(String customerId, String drinkName, Money orderTotal) {
    return orderRepository.save(new CreateDrinkOrderCommand(customerId, drinkName, orderTotal));
  }
}
