package com.bevbot.bartender.api.config;

import com.bevbot.bartender.api.drink.DrinkOrder;
import com.bevbot.bartender.api.drink.DrinkOrderCommand;
import com.bevbot.bartender.api.drink.DrinkService;
import com.bevbot.bartender.api.drink.DrinkServiceImpl;
import io.eventuate.javaclient.driver.EventuateDriverConfiguration;
import io.eventuate.javaclient.spring.EnableEventHandlers;
import io.eventuate.sync.AggregateRepository;
import io.eventuate.sync.EventuateAggregateStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(EventuateDriverConfiguration.class)
@EnableEventHandlers
public class BartenderApiConfig {

    @Bean
    public DrinkService orderService(AggregateRepository<DrinkOrder, DrinkOrderCommand> orderRepository) {
        return new DrinkServiceImpl(orderRepository);
    }

    @Bean
    public AggregateRepository<DrinkOrder, DrinkOrderCommand> orderRepository(EventuateAggregateStore eventStore) {
        return new AggregateRepository<>(DrinkOrder.class, eventStore);
    }
}


