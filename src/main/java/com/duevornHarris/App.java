package com.duevornHarris;

/**
 * Created by duevornharris on 5/18/16.
 */
public class App {
    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.whatAreYourPetNames();
        polymorphism.describeYourPetTypes();
        polymorphism.makeThePetsSpeak(polymorphism.listOfPets);
    }
}
