package day6.problem_statement.e_commerce;

// Concrete class Clothing implementing Product and Taxable
public class Clothing extends Product implements Taxable {
    private static final double TAX_RATE = 0.05; // 5% tax
    private static final double DISCOUNT_RATE = 0.20; // 20% discount

    // Constructor
    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    // Implement calculateDiscount
    @Override
    public double calculateDiscount() {
        return getPrice() * DISCOUNT_RATE;
    }

    // Implement calculateTax
    @Override
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    // Implement getTaxDetails
    @Override
    public String getTaxDetails() {
        return "Tax Rate: " + (TAX_RATE * 100) + "%";
    }
}
