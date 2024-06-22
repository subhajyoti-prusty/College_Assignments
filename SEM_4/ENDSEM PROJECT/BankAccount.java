
// BankAccount.java
public class BankAccount {
    private String accountNumber;
    private double balance;

    // InsufficientFundsException.java
    public class InsufficientFundsException extends Exception {
        public InsufficientFundsException(String message) {
            super(message);
        }
    }

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal. Current balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Example transactions
        try {
            account.deposit(500);
            account.withdraw(200);
            account.withdraw(1500); // This should throw an exception
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
