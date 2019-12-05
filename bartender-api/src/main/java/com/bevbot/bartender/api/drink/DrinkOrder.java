package com.bevbot.bartender.api.drink;

import io.eventuate.Event;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;

import java.util.List;

import static io.eventuate.EventUtil.events;

public class DrinkOrder extends ReflectiveMutableCommandProcessingAggregate<DrinkOrder, DrinkOrderCommand> {

    private String customerName;
    private String drinkName;
    private String orderId;

    public List<Event> process(CreateDrinkOrderCommand cmd) {
        return events(new DrinkOrderCreatedEvent(cmd.getCustomerId(), cmd.getDrinkName(), cmd.getOrderTotal()));
    }

    public void apply(DrinkOrderCreatedEvent event) {
        this.customerName = event.getCustomerName();
    }

}
