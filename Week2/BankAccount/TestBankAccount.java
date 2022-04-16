
public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount bankAcct1 = new BankAccount();
        // Print bankAcct1 account number and balances
        System.out.println("\nAccount Number: " + bankAcct1.getAccountNumber());
        bankAcct1.depositAmount(3000.50, "checking");
        bankAcct1.withdrawAmount(2000.50, "checking");
        bankAcct1.depositAmount(10000.10, "savings");
        bankAcct1.withdrawAmount(5000.10, "savings");
        bankAcct1.displayAccountBalance();
        System.out.println("\n");

        BankAccount bankAcct2 = new BankAccount();
        // Print bankAcct2 account number and balances
        System.out.println("Account Number: " + bankAcct2.getAccountNumber());
        bankAcct2.depositAmount(2000.50, "checking");
        bankAcct2.withdrawAmount(1000.50, "checking");
        bankAcct2.depositAmount(50000, "savings");
        bankAcct2.withdrawAmount(40000, "savings");
        bankAcct2.displayAccountBalance();
        System.out.println("\n");

        // Print total number of account(s) created
        System.out.println("Number of accounts: " + BankAccount.numberOfAccounts);

        // Print total balance from the bank accounts
        System.out.println("\nCombined Account Balances: " + BankAccount.totalBalance);

    }
}
