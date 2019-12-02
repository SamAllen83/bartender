package com.bevbot.bartender.api.config;

import io.eventuate.AggregateRepository;
import io.eventuate.EventuateAggregateStore;
import io.eventuate.javaclient.spring.EnableEventHandlers;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;


@Configuration
@EntityScan("com.bevbot.bartender.api")
@EnableJpaRepositories("com.bevbot.bartender.api")
@EnableEventHandlers
public class BartenderApiConfig {

//  @Bean
//  public TodoEventSubscriber todoEventSubscriber() {
//    return new TodoEventSubscriber();
//  }
//
//  @Bean
//  public AggregateRepository<TodoAggregate, TodoCommand> aggregateRepository(EventuateAggregateStore eventStore) {
//    return new AggregateRepository<>(TodoAggregate.class, eventStore);
//  }
//
//  @Bean
//  public AggregateRepository<TodoBulkDeleteAggregate, TodoCommand> bulkDeleteAggregateRepository(EventuateAggregateStore eventStore) {
//    return new AggregateRepository<>(TodoBulkDeleteAggregate.class, eventStore);
//  }
//
//  @Bean
//  public TodoService updateService(AggregateRepository<TodoAggregate, TodoCommand> aggregateRepository, AggregateRepository<TodoBulkDeleteAggregate, TodoCommand> bulkDeleteAggregateRepository) {
//    return new TodoService(aggregateRepository, bulkDeleteAggregateRepository);
//  }
//
//  @Bean
//  public TodoViewServiceImpl commandService(TodoRepository repository) {
//    return new TodoViewServiceImpl(repository);
//  }

  @Bean
  public HttpMessageConverters customConverters() {
    HttpMessageConverter<?> additional = new MappingJackson2HttpMessageConverter();
    return new HttpMessageConverters(additional);
  }
}


