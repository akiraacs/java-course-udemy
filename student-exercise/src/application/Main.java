package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Student student = new Student();

        Scanner sc = new Scanner(System.in);

        System.out.print("Student name: ");
        student.name = sc.nextLine();

        System.out.print("First quarter note: ");
        student.firstQuarterNote = sc.nextDouble();
        System.out.print("Second quarter note: ");
        student.secondQuarterNote = sc.nextDouble();
        System.out.print("Third quarter note: ");
        student.thirdQuarterNote = sc.nextDouble();

        sc.close();

        System.out.print(student);
    }
}