package com.bevbot.bartender.api.drink;

public class CreateDrinkOrderCommand implements DrinkOrderCommand {
  private final String customerId;
  private final Money orderTotal;
  private String drinkName;

  public CreateDrinkOrderCommand(String customerId, String drinkName, Money orderTotal) {
    this.customerId = customerId;
    this.drinkName = drinkName;
    this.orderTotal = orderTotal;
  }

  public String getCustomerId() {
    return customerId;
  }

  public Money getOrderTotal(){
    return orderTotal;
  }

  public String getDrinkName() {
    return drinkName;
  }
}
