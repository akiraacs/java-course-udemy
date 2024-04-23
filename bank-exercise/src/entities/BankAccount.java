package entities;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    public static double WITHDRAWALFEE = 5.00;

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        this.balance -= (amount + WITHDRAWALFEE);
    }

    public String toString() {
        return String.format(
            "Account %d, Holder: %s, Balance: $ %.2f",
            getAccountNumber(),
            getAccountHolder(),
            getBalance()
        );
    }
}
