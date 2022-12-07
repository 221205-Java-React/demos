package com.revature;


import com.revature.models.Dog;
import com.revature.models.Pitbull;

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

        //using pitbull constructors
        Pitbull pit1 = new Pitbull();
        Pitbull pit2 = new Pitbull("John Cena", 3, 60, true);

        //let's see the variables of these pitbulls
        System.out.println(pit1.name + " is " + pit1.age + " and " + pit1.weight + " pounds.");
        System.out.println(pit2.name + " is " + pit2.age + " and " + pit2.weight + " pounds.");

        //using pitbull methods
        System.out.println(pit2.bark());
        //note that this bark() method if different from the Dog one because of OVERRIDING
        pit2.bite("mailman");
        pit2.bite("another pitbull");
        pit2.bite("world renowned club banger creator Pitbull");

    } //end of main method

} //end of Launcher Class