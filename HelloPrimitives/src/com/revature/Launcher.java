package com.revature;

//I like to call the Class holding the main method "Launcher"
//because it's what launches when the application starts
public class Launcher {

    public static void main(String[] args) {

        //int is the most common integer-type primitive (others are byte, short, long)
        int i = 500000000;

        //if you ever need a REALLY big number, you can use the long type
        long l = 5000000000000000000L; //longs need an "L" at the end

        //we can use +, -, *, / to do operations on numbers
        System.out.println(5 + 10 - 2 * 5 / 2);

        //we can use + to concatenate (attach) variables to a String
        System.out.println("The value of my int is: " + i);

        //chars are written with 'single quotes', unless they're numbers
        //they represent a single CHARacter, so we can't have multiple characters in a char
        char c = 'c';

        char c2 = 15000; //WHAT? I thought chars could only hold one character
        //True, but numbers in char's case are UNICODE VALUES
        System.out.println(c2);

        //doubles are the most common floating-point number (they have decimals)
        double d = 2.5678;

        //what happens if we add an int and a double?
        System.out.println(5 + d);

        //the last primitive we'll look at is boolean
        //this is the ONLY way to denote true/false in Java
        boolean bool = true;
        boolean bool2 = false;

        System.out.println(bool);
        System.out.println(bool2);

        //if else statements check for true or false, which is one place booleans are needed
        if(bool){
            System.out.println("My boolean is true");
            //this code runs because bool equals true
        }

        //else statements run if the initial "if" condition is false
        if(bool2){
            System.out.println("This won't run :(");
        } else {
            System.out.println("My boolean is false");
            //this code runs because bool2 equals false
        }

        System.out.println("================================(Arithmetic operators)");

        /*
        we saw above how +, -, *, / work
        (addition, subtraction, multiplication, division)
        the modulus (%) returns the REMAINDER of a division
        */

        //practical example of % to determine even/odd

        int testNumber = 10;

        //"If the remainder of 10 / 2 is zero" then the number is even
        if(testNumber % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        //demonstrating ternary operators (quicker more elegant if/else) (not on QC)
        String st= testNumber % 2 == 0 ? "even":"odd";
        //"if the value to the left of the ? is TRUE, then the LEFT value is used"
        //"if the value to the left of the ? is FALSE, then the RIGHT value is used"
        //we could do this with any data type!!!
        System.out.println(st);

        System.out.println("================================(Increment/Decrement)");

        //we use ++ to increase a number by 1 (increment)
        //we use -- to decrease a number by 1 (decrement)
        //very useful in loops or any kind of counter

        int funnyNumber = 24;
        System.out.println("funnyNumber is equal to " + funnyNumber);

        funnyNumber++; //this will increase the value of our int by 1
        System.out.println("What's funnier than 24: " + funnyNumber);

        funnyNumber--; //this will decrease the value of our int by 1
        System.out.println("funnyNumber is now less funny: " + funnyNumber);

        //pre vs post increment??

        int k = 5;

        //what's the difference between k++ and ++k?
        //they both increment k, but WHEN the increment happens is different

        System.out.println(k++); //this will print out 5, THEN increment int k
        System.out.println(k);

        //this is where pre increments come in handy
        System.out.println(++k); //this will perform the increment BEFORE printing

        /*
        RULE OF THUMB:
        pre-increment increments FIRST, then does whatever it's doing
        post-increment increments AFTER whatever logic it's performing
        */

    }

}