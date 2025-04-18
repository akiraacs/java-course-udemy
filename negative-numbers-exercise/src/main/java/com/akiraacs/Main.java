package com.akiraacs;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers will you enter?");
        int quantityInsert = sc.nextInt();

        int[] numbers = new int[quantityInsert];

        for (int i = 0; i < quantityInsert; i++) {
            System.out.println("Enter a number:");
            numbers[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
            }
        }

        sc.close();
    }
}