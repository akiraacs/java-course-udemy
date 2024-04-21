package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        rectangle.width = sc.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        rectangle.height = sc.nextDouble();

        sc.close();
        System.out.println(rectangle);
    }
}
