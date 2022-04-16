import java.util.Random;

public class BankAccount {

    // Class attributes for checking and savings accounts
    private double checkingBalance;
    private double savingsBalance;

    // NINJA BONUS: Add the the following class attribute: account number.
    private int accounNumber;

    // Create a class member (static) that has the number of accounts created thus
    // far.
    public static int numberOfAccounts = 0;

    // Create a class member (static) that tracks the total amount of money stored
    // in every account created.
    public static double totalBalance = 0;

    private static int createAccountId() {
        Random randGenerator = new Random();
        int accountId = randGenerator.nextInt(1000000000) + 999999999;
        return accountId;
    }

    // In the constructor, be sure to increment the account count.
    public BankAccount() {
        numberOfAccounts++;
        this.accounNumber = BankAccount.createAccountId();
    }

    // Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    // Create a getter method for the user's saving account balance.
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    // NINJA BONUS
    public int getAccountNumber() {
        return this.accounNumber;
    }

    // Create a getter method for the user's checking account balance.
    // Create a getter method for the user's saving account balance.
    public void depositAmount(double balance, String account) {
        if (account.equals("checking")) {
            this.checkingBalance = this.checkingBalance + balance;
        } else if (account.equals("savings")) {
            this.savingsBalance = this.savingsBalance + balance;
        }
        BankAccount.totalBalance = totalBalance + balance;
    }

    // Create a method to withdraw money from one balance. Do not allow them to
    // withdraw money if there are insufficient funds.
    public void withdrawAmount(double balance, String account) {
        boolean canWithdraw = false;
        if (account.equals("checking")) {
            // check if there is enough balance
            if (this.checkingBalance - balance >= 0) {
                canWithdraw = true;
                this.checkingBalance = this.checkingBalance - balance;
            }
            if (canWithdraw) {
                BankAccount.totalBalance = BankAccount.totalBalance - balance;
            }
        } else if (account.equals("savings")) {
            if (this.savingsBalance - balance >= 0) {
                canWithdraw = true;
                this.savingsBalance = this.savingsBalance - balance;
            }
            if (canWithdraw) {
                BankAccount.totalBalance = BankAccount.totalBalance - balance;
            }
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    // Create a method to see the total money from the checking and saving.
    public void displayAccountBalance() {
        System.out.printf("Checking: $%.2f, Savings: $%.2f", this.checkingBalance, this.savingsBalance);
    }

}
