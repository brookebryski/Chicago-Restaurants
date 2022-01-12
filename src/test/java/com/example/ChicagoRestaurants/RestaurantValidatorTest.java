package com.example.ChicagoRestaurants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RestaurantValidatorTest {

    @Test
    public void given1GetTrue() {
        // Given: I am a user
        RestaurantValidator restaurantValidator = new RestaurantValidator();
        // When: I enter the string "1"
        boolean isRestaurant = restaurantValidator.isRestaurant("1");
        // Then: I get back "true"
        assertTrue(isRestaurant);
    }

    @Test
    public void given5GetTrue() {
        // Given: I am a user
        RestaurantValidator restaurantValidator = new RestaurantValidator();
        // When: I enter the string "5"
        boolean isRestaurant = restaurantValidator.isRestaurant("5");
        // Then: I get back "true"
        assertTrue(isRestaurant);
    }

    @Test
    public void given10GetTrue() {
        // Given: I am a user
        RestaurantValidator restaurantValidator = new RestaurantValidator();
        // When: I enter the string "10"
        boolean isRestaurant = restaurantValidator.isRestaurant("10");
        // Then: I get back "true"
        assertTrue(isRestaurant);
    }

    @Test
    public void given0GetFalse() {
        // Given: I am a user
        RestaurantValidator restaurantValidator = new RestaurantValidator();
        // When: I enter the string "0"
        boolean isRestaurant = restaurantValidator.isRestaurant("0");
        // Then: I get back "false"
        assertFalse(isRestaurant);
    }

    @Test
    public void given11GetFalse() {
        // Given: I am a user
        RestaurantValidator restaurantValidator = new RestaurantValidator();
        // When: I enter the string "11"
        boolean isRestaurant = restaurantValidator.isRestaurant("11");
        // Then: I get back "false"
        assertFalse(isRestaurant);
    }
}
