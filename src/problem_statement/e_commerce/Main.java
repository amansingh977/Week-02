package day6.problem_statement.e_commerce;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of products
        List<Product> products = new ArrayList<>();

        // Add Electronics, Clothing, and Groceries to the list
        Electronics laptop = new Electronics(1, "Laptop", 50000);
        Clothing shirt = new Clothing(2, "Shirt", 1500);
        Groceries rice = new Groceries(3, "Rice", 800);

        products.add(laptop);
        products.add(shirt);
        products.add(rice);

        // Calculate and display the final price for each product
        for (Product product : products) {
            product.displayDetails();
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
                System.out.println("Tax: " + tax);
            }
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------------");
        }
    }
}
