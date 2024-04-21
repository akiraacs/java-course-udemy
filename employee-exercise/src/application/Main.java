package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Employee employee = new Employee();

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee's name: ");
        employee.name = sc.nextLine();

        System.out.print("Employee's gross salary: ");
        employee.grossSalary = sc.nextDouble();

        System.out.print("Employee's tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("\nEmployee: %s\n", employee);

        System.out.print("Which percentage increase salary? ");
        double percentageIncrease = sc.nextDouble();
        employee.increaseSalary(percentageIncrease);

        System.out.printf("\nUpdate data: %s", employee);

        sc.close();
    }
}