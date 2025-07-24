package LMSTasks;

    public class BankAccount {
    public static void main(String[] args) {
        // Declare variables
        String accountHolderName = "Aarya";
        double accountBalance = 200.0;
        boolean isAccountActive = true;
        int numberOfTransactions = 0;

        double depositAmount = 150.0;
        double withdrawalAmount = 50.0;

        // Deposit operation
        if (depositAmount > 0 && isAccountActive) {
            accountBalance += depositAmount;  // Arithmetic
            numberOfTransactions++;          // Increment
            System.out.println("Deposited: $" + depositAmount);
        } else {
            System.out.println("Deposit failed: Invalid amount or account inactive.");
        }

        // Withdrawal operation
        if (withdrawalAmount > 0 && withdrawalAmount <= accountBalance && isAccountActive) {
            accountBalance -= withdrawalAmount; // Arithmetic
            numberOfTransactions++;            // Increment
            System.out.println("Withdrew: $" + withdrawalAmount);
        } else {
            System.out.println("Withdrawal failed: Invalid amount, insufficient balance, or inactive account.");
        }

        // Print final summary
        System.out.println("\n--- Account Summary ---");
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Final Balance: $" + accountBalance);
        System.out.println("Number of Transactions: " + numberOfTransactions);

        // Relational check for low balance
        if (accountBalance < 100.0) {
            System.out.println("Warning: Balance is below the minimum threshold!");
        }
    }
}
