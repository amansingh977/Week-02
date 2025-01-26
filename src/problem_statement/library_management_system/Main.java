package day6.problem_statement.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of LibraryItems
        List<LibraryItem> items = new ArrayList<>();

        // Add Book, Magazine, and DVD to the list
        Book book = new Book("B001", "The Catcher in the Rye", "J.D. Salinger");
        Magazine magazine = new Magazine("M001", "National Geographic", "Various");
        DVD dvd = new DVD("D001", "Inception", "Christopher Nolan");

        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Process each library item
        for (LibraryItem item : items) {
            item.getItemDetails();

            // Display loan duration
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            // Check availability
            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                if (reservable.checkAvailability()) {
                    System.out.println("Item is available for loan.");
                    reservable.reserveItem();
                } else {
                    System.out.println("Item is currently unavailable.");
                }
            }

            System.out.println("-----------------------------------");
        }
    }
}
