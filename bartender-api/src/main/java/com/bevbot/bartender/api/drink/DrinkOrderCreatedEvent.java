package com.bevbot.bartender.api.drink;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class DrinkOrderCreatedEvent implements DrinkOrderEvent {
  private Money orderTotal;
  private String customerName;
  private String drinkName;

  @Override
  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj);
  }

  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  public DrinkOrderCreatedEvent() {
  }

  public DrinkOrderCreatedEvent(String customerName, String drinkName, Money orderTotal) {
    this.customerName = customerName;
    this.orderTotal = orderTotal;
    this.drinkName = drinkName;
  }

  public Money getOrderTotal() {
    return orderTotal;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getDrinkName() {
    return drinkName;
  }
}
