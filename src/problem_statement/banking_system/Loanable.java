package day6.problem_statement.banking_system;

// Interface Loanable with methods for loan application and eligibility
public interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
