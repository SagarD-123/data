// // User-defined exception
// class InsufficientFundsException extends Exception {
//     public InsufficientFundsException(String message) {
//         super();
//     }
// }

// // Bank account class
// class CheckingAccount {
//     private double balance;

//     // Constructor
//     public CheckingAccount(double initialBalance) {
//         balance = initialBalance;
//     }

//     // Method to withdraw funds
//     public void withdraw(double amount) throws InsufficientFundsException {
//         if (amount <= balance) {
//             balance -= amount;
//             System.out.println("Withdrawal successful. Remaining balance: " + balance);
//         } else {
//             throw new InsufficientFundsException("Insufficient funds to withdraw $" + amount);
//         }
//     }

//     // Method to get balance
//     public double getBalance() {
//         return balance;
//     }
// }

// // Main class
// public class Main {
//     public static void main(String[] args) {
//         CheckingAccount account = new CheckingAccount(1000.0);

//         try {
//             // Try to withdraw an amount
//             account.withdraw(1500.0);
//         } catch (InsufficientFundsException e) {
//             // Catch the InsufficientFundsException
//             System.out.println("Exception caught: " + e.getMessage());
//         }

//         // Display remaining balance
//         System.out.println("Current Balance: $" + account.getBalance());
//     }
// }
