package com.revature.models;

//This is a Class meant to model a Dog - think of it as a "model" or "blueprint" for all Dog objects
//This Class defines all the attributes (fields/variables) and behaviors (methods) of Dogs
public class Dog {

    //Declare some Dog fields - every dog object will have these attributes
    public String name;
    public int age;
    public int weight;

    //Declare a method for the Dog Class. Something Dogs can do
    public String bark(){
        /*
        This line RETURNS a String. When this method is called, this String gets returned
        What is this.name? this. refers to a variable belonging to THIS class/object
        so here we're saying get the name variable of this specific Dog
        */
        return this.name + " goes bark bark bark";
    }
    /* Method Disambiguation:
        This bark() method is public, so it's visible everywhere
        It has a return type of String, so it must return a String
        It takes no (parameters), so calling this method doesn't require us to provide any more info
     */


    //Constructors Below-------------------------------------------

    /*
    Remember, constructors are how we give values to the object's variables
    When we instantiate an object, we use a constructor depending on what values we want it to have
    Constructors will have the same name as the Class but no return type
    */

    //no-args constructor. No args constructors take no arguments. Typically used for default values
    //If you create a Dog with no parameters, this constructor will get called
    public Dog() {
        this.name = "Braxton";
        this.age = 1;
        this.weight = 70;
    }

    //all-args constructor. This constructor takes a parameter (argument) for each Dog variable
    //This lets us make dogs with whatever values we choose
    public Dog(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Yes, we can have "some-args" constructors where the user is only able to insert "some" values
    //Good for is one variable will always start with the value, etc.
        //Imagine a "Player" Class where every Player starts with x amount of money

}
