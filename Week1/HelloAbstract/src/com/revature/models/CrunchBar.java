package com.revature.models;

/*
This concrete Class extends the Candy Abstract Class
Think of it as a more specific version of the more generic Candy Abstract Class
Candy also implements the Food Interface, so CrunchBar is a Candy, and it is also a Food
In other words, CrunchBar has inherited EVERY member found in Candy and in Food
 */

import com.revature.Launcher;

//if we don't implement the inherited abstract methods, the compiler will complain
//"HEY. You need to either be an abstract Class, or implement those abstract methods you inherited"
public class CrunchBar extends Candy {

    //a couple variables unique to the CrunchBar Class
    public int riceCount = 100;
    public int brickCount = 15;

    //This is the method from the Abstract Class. Every Candy can get opened, but not all in the same way.
    @Override
    public void getOpened() {
        System.out.println("CrunchBar got unwrapped");
    }

    //This is one of the methods from the Interface. Not all Foods will get eaten the same way.
    @Override
    public void getEaten() {
        System.out.println("CrunchBar gets broken apart and consumed");
    }

    //This is another method from the Interface. Not all Foods get thrown away the same way.
    @Override
    public void throwAway(int days) {
        System.out.println("CrunchBar got thrown away after " + days + " days. You monster.");
    }

    //constructors---------------------

    //no-args constructor
    public CrunchBar() {
        super(); //this calls the no args constructor of Candy, which calls from the Object Class
    }

    //all-args
    public CrunchBar(int riceCount, int brickCount) {
        this.riceCount = riceCount;
        this.brickCount = brickCount;
    }
}
