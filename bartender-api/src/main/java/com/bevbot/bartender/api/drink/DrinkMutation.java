package com.bevbot.bartender.api.drink;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import io.eventuate.EntityWithIdAndVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DrinkMutation implements GraphQLMutationResolver {
    private static final Logger LOGGER = LoggerFactory.getLogger(DrinkMutation.class);

    @Autowired
    private DrinkService drinkService;

    public DrinkOrder orderDrink(String customerName, String drinkName) {
        LOGGER.info("orderDrink called.  Customer {} drink {}", customerName, drinkName);
        EntityWithIdAndVersion<DrinkOrder> drinkOrder = drinkService.createOrder(customerName, drinkName, new Money(5));
        String orderId = drinkOrder.getEntityId();
        LOGGER.info("Order created.  Customer {} drink {} orderId {}", customerName, drinkName, orderId);
        return drinkOrder.getAggregate();
    }
}
