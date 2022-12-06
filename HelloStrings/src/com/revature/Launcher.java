package com.revature;

import java.util.Scanner;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("====================================(String Immutability)");

        //Strings are objects, but they don't necessarily need the "new" keyword
        String s = "I am immutable (AKA unchangeable)";

        //The String class has no methods that can directly change a String...

        s.toUpperCase(); //This WILL return the String in ALL CAPS, but it won't change the OG String
        //This operation IS happening, just not getting saved anywhere

        System.out.println(s); //This returns the original String

        //We COULD set the s variable to the mutation
        s = s.toUpperCase();
        System.out.println(s); //Now s returns the capitalized String

        System.out.println("====================================(String Equality)");

        //we can check for primitive equality with ==
        int i = 5;
        System.out.println(5 == i);

        //for Strings (and any objects) however, we need to use the .equals() method

        String s1 = "Hi Java"; //This is a String literal (no "new" keyword)
        String s2 = "Hi Java"; //This is another String literal with the same value as above
        //JAVA WILL MAKE THESE VARIABLES POINT TO THE SAME OBJECT

        //since we used the "new" keyword, this will be a brand NEW object in memory
        String s3 = new String("Hi Java");

        String s4 = "hi java"; //This makes a new object in memory.
        //there is no String that equals "hi java" before this one was created

        System.out.println(s1 == s2); //true, == compares MEMORY ADDRESS
        System.out.println(s1 == s3); //false, identical String, but s1 and s3 are two different objects
        System.out.println(s1.equals(s2)); //true, .equals() compares object VALUES
        System.out.println(s1.equals(s3)); //true, .equals() compares object VALUES not memory address

        System.out.println("==============================(String methods)");

        //a pangram to use some String methods on
        String pangram = "Sphinx of Black Quartz, Judge my vow";

        //.length() is a method that returns an int representing the length of String
        System.out.println(pangram.length());

        //.charAt() is a method that returns the char at the given index (place)
        System.out.println(pangram.charAt(0)); //this returns the first index
        System.out.println(pangram.charAt(pangram.length() - 1)); //this returns the last index

        //.subString() is a method returns a String found within the original String
        System.out.println(pangram.substring(10, 30));

        //.split() is a method that will create an Array via certain delimiters
        System.out.println(pangram.split(" "));
        //This gives us a bunch of nonsense. That nonsense is THE MEMORY ADDRESS of the Array
        //we can't print objects usually. Strings are able to simply print out despite being objects

        //we should make a String Array! and then loop through it to get the values
        String[] words = pangram.split(" ");

        //I'm going to use an "enhanced for loop" to loop (aka iterate) through this array
        for(String word : words){ //"for every word in the words Array, print the word out"
            System.out.println(word);
        }

        //"For every word in the Array called words, print out the word"

        System.out.println("===============================(Scanner)");

        //Instantiate a new Scanner object so that we can take in user inputs
        Scanner scan = new Scanner(System.in);
        //System.in is how tell the Scanner that inputs will come from the console

        System.out.println("What's your name?"); //ask the user a question

        //we can gather String (or general) input using the nextLine() method
        String name = scan.nextLine(); //nextLine() gathers user input AND creates a new line

        System.out.println(name + "? That's a lovely name"); //using the input in this print statement

        System.out.println("How old are you?");

        int age = scan.nextInt(); //we can use this to gather an int BUT it does NOT make a new line
        scan.nextLine(); //we need to explicitly call .nextLine() in order to get a new line

        System.out.println(age + "?? You don't look a day over 80!");

        System.out.println("What is the best starter pokemon?");

        String poke = scan.nextLine();

        //switch case which lets us test a value against multiple different choices
        //if the value matches one of the choices, a specific action will execute
        switch(poke){
            case "Charmander": {
                System.out.println("That is incorrect");
                break;
            }
            case "Mudkip": {
                System.out.println("That is correct!");
                break;
            }
            default: { //if none of these cases are matches, we can use a default block
                System.out.println("Entry not recognized - I only know 2 pokemon");
            }
        }

        //and yes, this could have also been done with an if/else

        //random but here's a popular way to turn a String into an int
        String num = "50";
        int intNum = Integer.parseInt(num);

    }

}
