package day6.problem_statement.online_food_delivery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of food items
        List<FoodItem> order = new ArrayList<>();

        // Add VegItem and NonVegItem to the order
        VegItem vegItem = new VegItem("Veg Pizza", 200.0, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Burger", 150.0, 3);

        order.add(vegItem);
        order.add(nonVegItem);

        // Process each food item in the order
        for (FoodItem foodItem : order) {
            foodItem.getItemDetails();

            // Calculate and display total price
            System.out.println("Total Price: " + foodItem.calculateTotalPrice());

            // Apply discount and display discount details
            if (foodItem instanceof Discountable) {
                Discountable discountable = (Discountable) foodItem;
                discountable.getDiscountDetails();
                discountable.applyDiscount();
            }

            System.out.println("-----------------------------------");
        }
    }
}

