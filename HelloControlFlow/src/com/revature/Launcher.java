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

        //WHILE the randomNumer is less than 200, the code in this while loop will run
        while(randomNumber < 200){
            randomNumber += 10;
            //+=? it's basically shorthand for randomNumber = randomNumber + 10;
            //so we're adding 10 to the value of randomNumber.

            //tell the user what number is now
            System.out.println("Random Number has increased to " + randomNumber);
        }
        System.out.println("While Loop has broken!");

    }

}
