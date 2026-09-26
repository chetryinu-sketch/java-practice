import java.util.Scanner;

class BankAccount {

    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative.");
        }
    }
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Error: Deposit amount cannot be negative.");
        } else {
            balance = balance + amount;
            System.out.println("Amount deposited successfully.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Name: Inu Chetry");
        System.out.println("URN: 2581328");

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        account.setAccountHolder(name);

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();
        account.setBalance(balance);

        System.out.print("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());

        sc.close();
    }
}