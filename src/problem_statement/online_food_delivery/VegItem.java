package day6.problem_statement.online_food_delivery;

// Subclass VegItem implementing FoodItem and Discountable
public class VegItem extends FoodItem implements Discountable {
    private static final double DISCOUNT_RATE = 0.10; // 10% discount for Veg items

    // Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Implement calculateTotalPrice (no additional charges for veg items)
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
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

