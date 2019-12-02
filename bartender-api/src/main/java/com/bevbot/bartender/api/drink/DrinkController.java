package com.bevbot.bartender.api.drink;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/drinks")
@RestController
public class DrinkController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DrinkController.class);

    @RequestMapping(path = "/order/{drinkName}", method = RequestMethod.POST)
    public String orderDrink(@PathVariable String drinkName) {
        String orderId = UUID.randomUUID().toString();
        LOGGER.info("Order created.  Drink {} orderId {}", drinkName, orderId);
        return orderId;
    }
}
