class BankAccount {
    // Static variable
    static String bankName = "Bank of india";
    // Static method
    static int totalAccounts = 0;
    static int getTotalAccounts() {
        return totalAccounts;
    }
    // This keyword
    private String accountHolderName;
    private final int accountNumber; // final keyword

    // constructor for initializing values
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // method for displaying result
    void displayAccountDetails() {
        if (this instanceof BankAccount) { // Check if this object is an instance of BankAccount
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account instance.");
        }
    }
}

public class BankAccountMain{
    public static void main(String[] args) {
        // initializing objects
        BankAccount account1 = new BankAccount("Radhe", 12345);
        BankAccount account2 = new BankAccount("Shyam", 67890);
        // printing account details
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());
        // displaying account details
        account1.displayAccountDetails();
        System.out.println();
        account2.displayAccountDetails();
    }
}