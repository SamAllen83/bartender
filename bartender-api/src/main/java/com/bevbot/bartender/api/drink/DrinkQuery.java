package com.bevbot.bartender.api.drink;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class DrinkQuery implements GraphQLQueryResolver {

    public String findOrder(String orderId) {
        return orderId;
    }
}
