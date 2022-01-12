package com.example.ChicagoRestaurants;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class FlowControlTest {
    private IRestaurantValidator _restaurantValidator;
    private IRestaurant _restaurant;
    private IFlowControl _flowControl;

    @BeforeEach
    public void setup() {
        this._restaurantValidator = mock(RestaurantValidator.class);
        this._restaurant = mock(Restaurant.class);
        this._flowControl = new FlowControl(_restaurantValidator, _restaurant);
    }

    @Test
    public void given1CallRestaurantOnce() {
        // Given: I am a user
        when(_restaurantValidator.isRestaurant("1")).thenReturn(true);
        when(_restaurant.generateRestaurant("1")).thenReturn(anyString());
        _flowControl.run("1");
        // When: I enter the string "1"
        // Then: Call Restaurant() once
        verify(_restaurant, times(1)).generateRestaurant("1");
    }

    @Test
    public void givenBobCallIsRestaurantOnce() {
        // Given: I am a user
        // When: I enter the string "Bob"
        when(_restaurantValidator.isRestaurant("Bob")).thenReturn(false);
        _flowControl.run("Bob");
        // Then: Call isRestaurant() once
        verify(_restaurantValidator, times(1)).isRestaurant("Bob");
    }

    @Test
    public void givenBobDoNotCallRestaurant() {
        // Given: I am a user
        // When: I enter the string "Bob"
        when(_restaurant.generateRestaurant(anyString())).thenReturn(anyString());
        _flowControl.run("Bob");
        // Then: Call Restaurant() zero times
        verify(_restaurant, never()).generateRestaurant(anyString());
    }
}
