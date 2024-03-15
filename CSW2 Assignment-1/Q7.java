abstract class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    protected void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
        // Update balance including interest
        setBalance(getBalance() + amount + interest);
    }

    @Override
    public void withdraw(double amount) {
        // Check if sufficient balance is available
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient funds for withdrawal");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        // Update balance
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        // Check if withdrawal amount exceeds overdraft limit
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Exceeds overdraft limit");
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        // Create instances of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000.0, 5.0);
        CurrentAccount currentAccount = new CurrentAccount("CA456", 2000.0, 500.0);

        // Deposit and withdraw operations
        savingsAccount.deposit(500.0);
        savingsAccount.withdraw(200.0);

        currentAccount.deposit(1000.0);
        currentAccount.withdraw(2500.0);

        // Display account details
        displayAccountDetails(savingsAccount);
        displayAccountDetails(currentAccount);
    }

    private static void displayAccountDetails(Account account) {
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println();
    }
}
