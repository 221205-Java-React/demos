package com.revature;


import com.revature.models.Dog;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("===================================(Using Our Constructors)");

        /*
        Recall that we need constructors to initialize object variables
        We'll be using the no args constructor the all args constructor to make some dogs
        */

        //Instantiating Dog object with the no args constructor
        Dog dog1 = new Dog();
        //Is this a reference variable or a primitive? REFERENCE because it's referencing an object

        //Make the dog bark
        System.out.println(dog1.bark());

        //Instantiate a Dog object with the all args constructor
        Dog dog2 = new Dog("Ralphy", 4, 90);
        System.out.println(dog2.bark());

        //let's see the variables of these dogs
        System.out.println(dog1.name + " is " + dog1.age + " and " + dog1.weight + " pounds.");
        System.out.println(dog2.name + " is " + dog2.age + " and " + dog2.weight + " pounds.");

    } //end of main method

} //end of Launcher Class