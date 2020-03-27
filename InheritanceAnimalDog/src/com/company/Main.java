package com.company;

public class Main {

    public static void main(String[] args) {
        Animal doggy = new Dog();
        doggy.bark();

        Dog dog = new Dog();
        dog.bark();

        Animal animal22 = dog;
        animal22.bark();

        Animal animal = new Animal();
        animal.bark();
    }
}
