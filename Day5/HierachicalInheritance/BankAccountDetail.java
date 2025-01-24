package HierachicalInheritance;
class BankAccount {
    protected String accountNumber;
    protected double balance;

    // create constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
	// display result
    public void displayAccountType() {
        System.out.println("Bank Account");
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;
    // create constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
	// display result	
    public void displayAccountType() {
        System.out.println("Savings Account");
    }
}
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;
    // create constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
	// display result
    public void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    private int tenure;
    // create constructor
    public FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }
	// display result
    public void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}
public class BankAccountDetail {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("12345", 5000);
        SavingsAccount savingsAccount = new SavingsAccount("54321", 10000, 4.5);
        CheckingAccount checkingAccount = new CheckingAccount("67890", 3000, 1000);
        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount("11223", 20000, 5);
        bankAccount.displayAccountType();
        savingsAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fixedDepositAccount.displayAccountType();
    }
}
