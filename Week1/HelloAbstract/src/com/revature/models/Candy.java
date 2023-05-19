package com.revature.models;

/*
This is an Abstract Class, note the abstract keyword. It will implement the Food Interface
So now, this Abstract Class also has access to the edible variable and the two methods of Food
Abstract Classes are Classes with AT LEAST one abstract method.

Why use an Abstract Class over an Interface?
-I use Abstract Classes when I KNOW I want to have methods that are defined.
-This causes all subclasses share the same default behavior for that method. 

-I use Interfaces when I don't care about specific implementations of methods
-If I'm fine with every subclass implementing the methods differently, I'll use an Interface
-I mostly use Interfaces
*/
public abstract class Candy implements Food {

    //Some variables that belong to the candy Abstract Class but NOT the Food Interface
    public boolean isSweet = true; //all candy is sweet, all food isn't necessarily sweet
    public int crunchFactor; //different candies are crunchier than others.
    //We can define this in subclasses


    //concrete method - has an implementation (method body)
    //all candies can be expected to melt, so we'll provide a specific implementation
    public void melt(){
        System.out.println("I'm melting :p");
    }

    /*abstract method - no method body
    so now, any Class that extends this Abstract Class will be required to implement this
    Every candy will get opened differently, so we'll leave the implementation up to the subclasses
     */
    public abstract void getOpened();

    /*
    Why use an Abstract Class over a Concrete (Regular) Class?
    Main reason - flexibility.
    We give inheting concrete classes freedom to implement abstract methods however they want.

    Abstract Class: "You need to be able to do this method, but it's up to you how you actually do it"
     Class1: "Ok I'm gonna do it this way"
     Class2: "Ok I'm gonna do it this other way"
     */

    /*
    Abstract Classes (like interfaces) cannot be instantiated (can't make an object out of them)
    HOWEVER, Abstract Classes can have constructors (which as we know, help us make an object)
    why???
    This is so that any concrete subclasses can have access to those constructors
    This abstract class DOES still get a default no-args constructor like any other Class
     */

}
