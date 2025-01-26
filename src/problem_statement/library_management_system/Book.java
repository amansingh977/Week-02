package day6.problem_statement.library_management_system;

// Subclass Book implementing LibraryItem and Reservable
public class Book extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 14; // 14 days for books

    // Constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    // Implement getLoanDuration
    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    // Implement reserveItem
    @Override
    public void reserveItem() {
        System.out.println("Book '" + getTitle() + "' has been reserved.");
    }

    // Implement checkAvailability
    @Override
    public boolean checkAvailability() {
        // Logic for checking availability (for now, returns true)
        return true;
    }
}
