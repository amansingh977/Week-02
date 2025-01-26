package day6.problem_statement.online_food_delivery;

// Subclass NonVegItem implementing FoodItem and Discountable
public class NonVegItem extends FoodItem implements Discountable {
    private static final double DISCOUNT_RATE = 0.05; // 5% discount for Non-Veg items
    private static final double ADDITIONAL_CHARGES = 20.0; // Additional charge for Non-Veg items

    // Constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implement calculateTotalPrice (includes additional charges for non-veg items)
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + ADDITIONAL_CHARGES;
    }

    // Implement applyDiscount
    @Override
    public void applyDiscount() {
        double discount = calculateTotalPrice() * DISCOUNT_RATE;
        double totalPriceAfterDiscount = calculateTotalPrice() - discount;
        System.out.println("Discount Applied: " + discount);
        System.out.println("Total Price After Discount: " + totalPriceAfterDiscount);
    }

    // Implement getDiscountDetails
    @Override
    public void getDiscountDetails() {
        System.out.println("Discount Rate: " + (DISCOUNT_RATE * 100) + "%");
    }
}
