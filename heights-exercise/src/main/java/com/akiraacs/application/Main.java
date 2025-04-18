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
            // Dados da nova pessoa que sera cadastrada
            String namePeople = sc.nextLine();
            int agePeople = sc.nextInt();
            double heightPeople = sc.nextDouble();

            arrayPeople[i] = new People(namePeople, agePeople, heightPeople);
            System.out.printf("Dados da %da pessoa:", i+1);
        }


        sc.close();
    }
}