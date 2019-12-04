package com.bevbot.bartender.api.drink;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DrinkMutation implements GraphQLMutationResolver {
    private static final Logger LOGGER = LoggerFactory.getLogger(DrinkMutation.class);

    public DrinkOrder orderDrink(String customerName, String drinkName) {
        String orderId = UUID.randomUUID().toString();
        LOGGER.info("Order created.  Customer {} drink {} orderId {}", customerName, drinkName, orderId);
        return DrinkOrder.builder().customerName(customerName).drinkName(drinkName).orderId(orderId).build();
    }
}
