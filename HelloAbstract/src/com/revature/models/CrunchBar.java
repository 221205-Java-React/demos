package com.revature.models;

/*
This concrete Class extends the Candy Abstract Class
Think of it as a more specific version of the more generic Candy Abstract Class
Candy also implements the Food Interface, so CrunchBar is a Candy, and it is also a Food
In other words, CrunchBar has inherited EVERY member found in Candy and in Food
 */

//if we don't implement the inherited abstract methods, the compiler will complain
//"HEY. You need to either be an abstract Class, or implement those abstract methods you inherited"
public class CrunchBar extends Candy {


    @Override
    public void getOpened() {
        
    }

    @Override
    public void getEaten() {

    }

    @Override
    public void throwAway(int days) {

    }
}
