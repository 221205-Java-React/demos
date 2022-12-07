package com.revature.models;

/*Pitbull extends Dog... SO what?

First of all, this is a primary example of INHERITANCE in Java (one of the pillars of OOP)
This means that the Pitbull Class has everything the Dog Class has (fields/methods)
BUT, it can also have its own fields and methods unique to Pitbull
Pitbull therefore is a child class of Dog. In other words, subclass/superclass relationship

We could make yet another Class that extends Pitbull, which would give it everything from Pitbull AND Dog
 */
public class Pitbull extends Dog {

    //Pitbull has all the members of Dog, but let's give it some unique ones as well

    //This is a variable unique to the Pitbull Class
    public boolean clippedEars = true; //we'll set it true by default, but this can change

    //This is a method unique to the Pitbull Class
    //Note that we're expected to include a String parameter when calling this method
    public void bite(String victim){
        System.out.println(this.name + " is untrained and bites " + victim);
    }

    /*
    METHOD OVERRIDING - we are taking the original bark() method from Dog, and changing what it does
    This is something only done in Child/Parent Class relationships. Children override Parents.

    If we had not overridden bark(), Pitbull would have the same exact bark() method
    But here, we declare the same method signature (first line), but with a different behavior
    THIS IS ANOTHER EXAMPLE OF POLYMORPHISM (a pillar of OOP)
    This is also Inheritance since we're inheriting bark() before we change it
    */
    @Override
    public String bark(){
        return this.name + " says MR WORLDWIIIIDE";
    }

    //Constructors Below---------------------(Check Dog Class if you're like "what are constructors?")

    //no-args constructor
    public Pitbull() {
        super(); //super calls the parent constructor! In this case, the no-args of Dog
        this.clippedEars = false; //the default is true, but it'll get set to false in the no-args
    }

    //all-args constructor
    public Pitbull(String name, int age, int weight, boolean clippedEars) {
        super(name, age, weight); //this time, we're calling the all-args constructor of dog
        this.clippedEars = clippedEars; //and whatever the user enter for clippedEars will be used
    }

    //calls to super(); are known as "constructor chaining" - calling a constructor within a constructor

}
