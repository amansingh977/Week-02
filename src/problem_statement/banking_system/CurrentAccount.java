package day6.problem_statement.banking_system;

// Subclass CurrentAccount implementing BankAccount
public class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.02; // 2% annual interest
    private static final double LOAN_ELIGIBILITY_FACTOR = 3.0; // Loan eligibility = 3x balance

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implement calculateInterest
    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    // Implement applyForLoan
    @Override
    public void applyForLoan(double amount) {
        if (amount <= calculateLoanEligibility()) {
            System.out.println("Loan Approved for: " + amount);
        } else {
            System.out.println("Loan Denied. Amount exceeds eligibility.");
        }
    }

    // Implement calculateLoanEligibility
    @Override
    public double calculateLoanEligibility() {
        return getBalance() * LOAN_ELIGIBILITY_FACTOR;
    }
}
