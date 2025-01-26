package day6.problem_statement.banking_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of bank accounts
        List<BankAccount> accounts = new ArrayList<>();

        // Add SavingsAccount and CurrentAccount to the list
        SavingsAccount savingsAccount = new SavingsAccount("123456", "Rajesh Sharma", 50000);
        CurrentAccount currentAccount = new CurrentAccount("789101", "Anjali Verma", 100000);

        accounts.add(savingsAccount);
        accounts.add(currentAccount);

        // Perform operations on each account
        for (BankAccount account : accounts) {
            account.displayDetails();

            // Deposit money
            account.deposit(10000);

            // Withdraw money
            account.withdraw(5000);

            // Calculate and display interest
            System.out.println("Annual Interest: " + account.calculateInterest());

            // Check if account is Loanable and apply for a loan
            if (account instanceof Loanable) {
                Loanable loanable = (Loanable) account;
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
                loanable.applyForLoan(60000);
            }

            System.out.println("-----------------------------------");
        }
    }
}

