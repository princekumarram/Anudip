class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private double balance;

    // Default constructor for predefined values
    public BankAccount() {
        this.accountHolderName = "Default Name";
        this.accountNumber = "000000";
        this.accountType = "Savings";
        this.balance = 1000.0;
    }

    // Parameterized constructor for custom values
    public BankAccount(String accountHolderName, String accountNumber, String accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        System.out.println("------------------------");
    }

    // Main method to test the system
    public static void main(String[] args) {
        // Create a default account
        BankAccount defaultAccount = new BankAccount();
        System.out.println("Default Account Details:");
        defaultAccount.displayAccountDetails();

        // Create a custom account
        BankAccount customAccount = new BankAccount("Prince Kumar Ram", "123456789", "Current", 5000.0);
        System.out.println("Custom Account Details:");
        customAccount.displayAccountDetails();
    }
}
