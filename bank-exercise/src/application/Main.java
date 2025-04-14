package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        BankAccount bankAccount;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char initialDeposit = sc.nextLine().charAt(0);

        if (initialDeposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();
            bankAccount = new BankAccount(accountNumber, accountHolder, depositValue);
        }
        else {
            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println();
        System.out.printf("Account data:\n%s\n", bankAccount);

        System.out.print("\nEnter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.deposit(depositValue);
        System.out.printf("Update account data:\n%s", bankAccount);
        System.out.println();

        System.out.print("\nEnter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdrawal(withdrawValue);
        System.out.printf("Update account data:\n%s", bankAccount);
        System.out.println();

        sc.close();
    }
}