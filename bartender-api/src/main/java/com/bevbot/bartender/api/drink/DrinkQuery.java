package com.bevbot.bartender.api.drink;

import java.io.IOException;
import java.util.List;

import com.bevbot.bartender.api.restaurant.Restaurant;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class DrinkQuery implements GraphQLQueryResolver {
    ResourceLoader resourceLoader = new DefaultResourceLoader();

    public String findOrder(String orderId) {
        return orderId;
    }

    public List<Restaurant> getRestaurants() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(resourceLoader.getResource("classpath:/restaurants.json").getURL(), new TypeReference<List<Restaurant>>(){});
    }
}
