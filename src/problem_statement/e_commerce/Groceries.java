package day6.problem_statement.e_commerce;

// Concrete class Groceries implementing Product
public class Groceries extends Product {
    private static final double DISCOUNT_RATE = 0.05; // 5% discount
    // No tax on groceries

    // Constructor
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implement calculateDiscount
    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }
}
