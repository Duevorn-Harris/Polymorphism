package com.duevornHarris;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by duevornharris on 5/18/16.
 */
public class Polymorphism {

    Scanner sc = new Scanner(System.in);
    Dog dog = new Dog();
    Cat cat = new Cat();
    Pig pig = new Pig();

    ArrayList<String> namesOfPets = new ArrayList<String>();
    ArrayList<String> listOfPets = new ArrayList<String>();

    int limit = 0;

    public Polymorphism() {
        System.out.println("How many pets do you have?");
        int numberOfPets = sc.nextInt();
        this.limit = numberOfPets;
    }


    public ArrayList<String> describeYourPetTypes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What kind of pets do you have?");
        for(int i = 0; i < limit; i++)
        {listOfPets.add(sc.nextLine());}
        return listOfPets;
    }

    public ArrayList<String> whatAreYourPetNames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What are the names of your pets?");
        for(int i = 0; i < limit; i++){
        namesOfPets.add(sc.next());}
        return namesOfPets;
    }

    public void makeThePetsSpeak(ArrayList<String> typesOfPets){
        for(int i = 0; i < limit; i++){
            if (typesOfPets.get(i).equals("dog")){
                dog.setName(namesOfPets.get(i));
                dog.speak("Woof");}
            else if (typesOfPets.get(i).equals("cat")){
                cat.setName(namesOfPets.get(i));
                cat.speak("Meow");}
            else if (typesOfPets.get(i).equals("pig")){
                pig.setName(namesOfPets.get(i));
                pig.speak("Oink");}
            }
        }
    }

