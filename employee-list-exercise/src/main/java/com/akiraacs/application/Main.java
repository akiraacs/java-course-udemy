package com.akiraacs.application;

import com.akiraacs.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int quantityEmployees = sc.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i=0; i<quantityEmployees; i++) {
            System.out.printf("Employee #%d%n", i + 1);

            // ID exists validation
            int idEmployee;
            boolean idExists;
            System.out.print("Id: ");

            do {
                idEmployee = sc.nextInt();

                int idToCheck = idEmployee; // Necessario passar variaveis "finais" para expressoes lambdas
                idExists = employees.stream().anyMatch(emp -> emp.getId() == idToCheck);

                if (idExists) {
                    System.out.print("This ID already exist. Enter a new ID: ");
                }

            } while (idExists);

            System.out.print("Name: ");
            sc.nextLine(); // Remove line break from buffer
            String nameEmployee = sc.nextLine();
            System.out.print("Salary: ");
            double salaryEmployee = sc.nextDouble();

            // Create new employee
            Employee emp = new Employee(idEmployee, nameEmployee, salaryEmployee);
            employees.add(emp);
        }

        System.out.println(employees);

        sc.close();
    }
}