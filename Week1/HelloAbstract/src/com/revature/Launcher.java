package com.revature;

import com.revature.models.CrunchBar;

public class Launcher {

    public static void main(String[] args) {

        //Instantiate a CrunchBar object
        CrunchBar crunch = new CrunchBar();

        //Use the concrete melt() method from the Candy Abstract Class
        crunch.melt();

        //Use the overridden getOpened method from the CrunchBar Class (which it inherited from Candy)
        crunch.getOpened();

        //Use the overridden getEaten method from the CrunchBar Class
        //(which it inherited from the Food Interface)
        crunch.getEaten();

        //Use the overridden throwAway method from the CrunchBar Class
        //(which it inherited from the Food Interface)
        crunch.throwAway(1000);

        //let's use some CrunchBar variables and remember where they came from

        //calling the isEdible variable from the Food Interface
        System.out.println(crunch.isEdible);
        System.out.println(CrunchBar.isEdible); //since it's static we can call this way as well

        //calling the isSweet variable from the Candy Abstract Class
        System.out.println(crunch.isSweet);

        //calling the two variables unique to CrunchBar
        System.out.println("CrunchBar has " + crunch.brickCount + " bricks");
        System.out.println("CrunchBar has a " + crunch.crunchFactor + " crunch factor");

    }

}
