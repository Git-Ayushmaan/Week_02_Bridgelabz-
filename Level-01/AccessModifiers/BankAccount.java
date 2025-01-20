public class BankAccount {
    public static void main(String[] args) {
        // Create an instance of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount();

        // Set attributes
        savingsAccount.accountNumber = "123456789";
        savingsAccount.accountHolder = "John Doe";
        savingsAccount.setBalance(1000.50f);

        // Display account details
        savingsAccount.displayAccountDetails();
        System.out.println("Balance: " + savingsAccount.getBalance());
    }

    // Public attribute for account number
    public String accountNumber;

    // Protected attribute for account holder
    protected String accountHolder;

    // Private attribute for account balance
    private float balance;

    // Public getter for balance
    public float getBalance() {
        return balance;
    }

    // Public setter for balance
    public void setBalance(float balance) {
        this.balance = balance;
    }

    // Subclass to demonstrate access to accountNumber and accountHolder
    public static class SavingsAccount extends BankAccount {
        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
        }
    }
}
