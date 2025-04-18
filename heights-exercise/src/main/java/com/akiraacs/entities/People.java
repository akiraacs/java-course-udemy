package com.akiraacs.entities;

public class People {
    public String name;
    public int age;
    public double height;

    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static double averageHeightPeople(People[] allPeople) {
        double sumHeightPeople = 0;

        for (int i=0; i<allPeople.length; i++) {
            sumHeightPeople += allPeople[i].height;
        }

        return sumHeightPeople / allPeople.length;
    }


    @Override
    public String toString() {
        return String.format(
            "Nome: %s\nIdade: %d\nAltura: %.2f",
            name, age, height
        );
    }
}
