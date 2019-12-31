package com.bevbot.bartender.api.drink;

import java.io.IOException;
import java.util.List;

import com.bevbot.bartender.api.restaurant.Restaurant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DrinkQueryTest {
    private DrinkQuery classUnderTest;

    @BeforeEach
    public void init() {
        classUnderTest = new DrinkQuery();
    }

    @Test
    public void testGetRestaurantsWhenJsonExpectPojoFromJson() throws IOException {
        List<Restaurant> restaurants = classUnderTest.getRestaurants();

        Assertions.assertNotNull(restaurants);
    }

}