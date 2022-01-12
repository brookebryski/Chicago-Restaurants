package com.example.ChicagoRestaurants;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "iRestaurantValidator")
    public RestaurantValidator createRestaurantValidator() { return new RestaurantValidator(); }

    @Bean(name = "iRestaurant")
    public Restaurant createRestaurant() { return new Restaurant(); }

    @Bean(name = "iFlowControl")
    public FlowControl createFlowControl() { return new FlowControl(createRestaurantValidator(), createRestaurant()); }
}
