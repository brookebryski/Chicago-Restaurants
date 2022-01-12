package com.example.ChicagoRestaurants;

public class FlowControl implements IFlowControl {
    private IRestaurantValidator _restaurantValidator;
    private IRestaurant _restaurant;

    public FlowControl(IRestaurantValidator restaurantValidator, IRestaurant restaurant) {
        this._restaurantValidator = restaurantValidator;
        this._restaurant = restaurant;
    }

    public void run(String input) {
        if(_restaurantValidator.isRestaurant(input)) {
            String result = _restaurant.generateRestaurant(input);
            System.out.println(result);
        }
    }
}
