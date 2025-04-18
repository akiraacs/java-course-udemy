package com.akiraacs.application;

import com.akiraacs.entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int quantityPeople = sc.nextInt();

        People[] arrayPeople = new People[quantityPeople];

        for (int i=0; i<arrayPeople.length; i++) {
            sc.nextLine();
            System.out.printf("\nDados da %da pessoa:\n", i+1);

            // Dados da nova pessoa que sera cadastrada
            System.out.println("Nome: ");
            String namePeople = sc.nextLine();

            System.out.println("Idade: ");
            int agePeople = sc.nextInt();

            System.out.println("Altura: ");
            double heightPeople = sc.nextDouble();

            arrayPeople[i] = new People(namePeople, agePeople, heightPeople);
//            System.out.println(arrayPeople[i]);

        }


        sc.close();
}
    }
