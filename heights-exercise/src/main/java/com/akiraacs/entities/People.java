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

    public String toString() {
        return String.format(
              "Nome: ", name,
              "Idade: ", age,
              "Altura: ", height
        );
    }
}
g