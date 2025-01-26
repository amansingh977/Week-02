package day6.problem_statement.banking_system;


// Subclass SavingsAccount implementing BankAccount and Loanable
public class SavingsAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest
    private static final double LOAN_ELIGIBILITY_FACTOR = 5.0; // Loan eligibility = 5x balance

    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance) {
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
