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

    public static int percentPeopleUnder16(People[] allPeople) {
        int countPeopleUnder16 = 0;

        for (int i=0; i<allPeople.length; i++) {
            if (allPeople[i].age < 16) {
                countPeopleUnder16++;
            }
        }

        return countPeopleUnder16 * 100 / allPeople.length;
    }

    public static void printNamePeopleUnder16(People[] allPeople) {
        for (int i=0; i<allPeople.length; i++) {
            if (allPeople[i].age < 16) {
                System.out.println(allPeople[i].name);
            }
        }
    }

    @Override
    public String toString() {
        return String.format(
            "Nome: %s\nIdade: %d\nAltura: %.2f",
            name, age, height
        );
    }
}
