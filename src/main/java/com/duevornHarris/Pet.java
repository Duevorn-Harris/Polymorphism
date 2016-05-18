package com.duevornHarris;

/**
 * Created by duevornharris on 5/18/16.
 */
public class Pet {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("The pets name is " + this.name);
    }

    public String speak(String speech) {
        System.out.println(this.name + " says " + speech);
        return speech;
    }
}
