package com.revature;

public class Launcher {

    public static void main(String[] args){

        //Using the built-in Math Class to get a random number
        int randomNumber = (int) (Math.random() * 100);
        /*
        What is (int) doing? Math.random() returns a double, we want to turn it into an int
        Math.random() returns a number between 0 and 1. multiply the result by 100 for more possibilities
        The number we get here will be used in some of our control flow statements below
        */

        System.out.println(randomNumber);

        System.out.println("========================(if/else if/else)");

        if(randomNumber > 75){
            System.out.println("Random Number is real big");
        }
        else if (randomNumber > 50){
            System.out.println("Random Number is midsized");
        }
        else {
            System.out.println("Random Number is smol");
        }

        System.out.println("=============================(while/do while)");

        //still using our randomNumber from above

        //While Loop---

        //WHILE the randomNumer is less than 200, the code in this while loop will run
        while(randomNumber < 200){
            randomNumber += 10;
            //+=? it's basically shorthand for randomNumber = randomNumber + 10;
            //so we're adding 10 to the value of randomNumber.

            //tell the user what number is now
            System.out.println("Random Number has increased to " + randomNumber);
        }
        System.out.println("While Loop has broken!");

        //Do-While Loop---

        //DO-WHILE LOOPS will execute the loop code at least once, before the condition is ever checked
        do {
            randomNumber -= 20;
            System.out.println("Random Number has decreased to " + randomNumber);
        } while (randomNumber > 100);

        System.out.println("Do While Loop has broken!");

        System.out.println("==============================(For Loops)");

        //basic for loop

        int loopVictim = 0; //we'll use this int in the for loop

        //"for as long as this int i, which starts at 0, is less than 10, increment it once per loop"
        //so in essence, we've written a loop than runs 10 times.
        for(int i = 0; i < 10; i++){
            //every time this loop loops, this code will run
            loopVictim++; //increment our loopVictim by 1
            System.out.println("Our loopVictim is: " + loopVictim);
            System.out.println("Our loop variable (i) is now: " + i);
        }

        //More interesting use of for loops---

        //This is an Array, which is essentially a list of values. In this case, a list of chars
        char[] myName = {'B', 'E', ' ', 'N', 'A', 'A', 'A'};

        //Arrays are INDEXED, so we can retrieve individual values using the index
        System.out.println(myName[0]);
        System.out.println(myName[6]);
        System.out.println("-----");

        //I'm going to use a for loop to iterate through this Array to only print out B E N

        //"as long as i < the length of the myName Array, run the block of code and increment i"
        for(int i = 0; i < myName.length; i++){

            if(myName[i] == ' ' || myName[i] == 'A'){
                continue; //continue causes the for loop to skip this iteration and go to the next one
            }

            //If the index we're on does not equal an empty space, print it out
            System.out.print(myName[i]);

            //NOTE - we're using print not println
            //println makes a new line, print doesn't

        }
    }

}