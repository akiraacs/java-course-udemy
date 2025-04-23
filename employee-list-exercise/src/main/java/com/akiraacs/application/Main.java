package com.akiraacs.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import com.akiraacs.entities.Employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantityEmployees = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i=0; i<quantityEmployees; i++) {
            System.out.printf("Employee #%d%n", i+1);

            System.out.print("Id: ");
            int idEmployee = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String nameEmployee = sc.nextLine();
            System.out.print("Salary: ");
            double salaryEmployee = sc.nextDouble();

            employees.add(new Employee(idEmployee, nameEmployee, salaryEmployee));
        }

        System.out.println(employees);

        sc.close();
    }
}