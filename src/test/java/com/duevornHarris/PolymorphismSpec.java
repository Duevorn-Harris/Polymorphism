package com.duevornHarris;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by duevornharris on 5/18/16.
 */
public class PolymorphismSpec {
    Pet pet;
    Dog dog;
    Cat cat;
    Pig pig;
    Polymorphism polymorphism;
    @Before
    public void petInitialize(){
        pet = new Pet();
        dog = new Dog();
        cat = new Cat();
        pig = new Pig();
        polymorphism = new Polymorphism();
    }

    @Test
    public void dogSpeechTest(){
        String expectedPetSpeech = "Woof";
        String actualPetSpeech = dog.speak("Woof");

        Assert.assertEquals("The dog speak method does not return 'Woof' ", expectedPetSpeech, actualPetSpeech);
    }

   @Test
    public void catSpeechTest(){
       String expectedPetSpeech = "Meow";
       String actualPetSpeech = cat.speak("Meow");

       Assert.assertEquals("The dog speak method does not return 'Meow' ", expectedPetSpeech, actualPetSpeech);
   }

    @Test
    public void pigSpeechTest(){
        String expectedPetSpeech = "Oink";
        String actualPetSpeech = pig.speak("Oink");

        Assert.assertEquals("The dog speak method does not return 'Woof' ", expectedPetSpeech, actualPetSpeech);
    }

    @Test
    public void getPetNameTest(){
        dog.setName("Odin");
        String actualPetName = dog.getName();

        Assert.assertEquals("The dog speak method does not return 'Woof' ", dog.name, actualPetName);
    }



}
