package com.revature;

import java.util.ArrayList;
import java.util.Scanner;

public class PigLatinTranslator {

    public static String englishToPigLatin(String input){

        //empty string input check---------------
        if (input.equals("")) {
            return "Please enter a word or phrase to translate!";
        }

        //number in input check-----------------
        char[] inputToChar = input.toCharArray();
        for(char c : inputToChar){
            if (Character.isDigit(c)) {
                throw new IllegalArgumentException();
            }
        }

        //if the checks pass, go through with the translation---------
        String result = "";

        input = input.toLowerCase();

        Scanner scan = new Scanner(input);

        while (scan.hasNext())
        {
            result += translateEnglishWord(scan.next());
            result += " ";
        }

        return result;
    }


    public static String translateEnglishWord (String word)
    {
        String result = "";

        //profanity filter - this is a family friendly Pig Latin translator application-----------
        ArrayList<String> badWords = new ArrayList<String>();
        badWords.add("dingus"); badWords.add("goofball"); badWords.add("javascript");
        badWords.add("heck"); badWords.add("skittle"); badWords.add("hyuck");

        if (badWords.contains(word.toLowerCase())) {
            return "Please try again, omitting those nasty brutish words you horrid oaf";
        } else if (word.toLowerCase().equals("frick")) {
            return null; //(This word is so bad that the return statement has nothing to say to you)
        }

        if (beginsWithVowel(word)) {
            result = word + "yay";
        }
        else if (beginsWithBlend(word)) {
            result = word.substring(2) + word.substring(0,2) + "ay";
        }
        else {
            result = word.substring(1) + word.charAt(0) + "ay";
        }

        return result;
    }

    public static boolean beginsWithVowel (String word)
    {
        String vowels = "aeiou";

        char letter = word.charAt(0);

        return (vowels.indexOf(letter) != -1);
    }

    public static boolean beginsWithBlend (String word)
    {
        return ( word.startsWith ("bl") || word.startsWith ("sc") ||
                word.startsWith ("br") || word.startsWith ("sh") ||
                word.startsWith ("ch") || word.startsWith ("sk") ||
                word.startsWith ("cl") || word.startsWith ("sl") ||
                word.startsWith ("cr") || word.startsWith ("sn") ||
                word.startsWith ("dr") || word.startsWith ("sm") ||
                word.startsWith ("dw") || word.startsWith ("sp") ||
                word.startsWith ("fl") || word.startsWith ("sq") ||
                word.startsWith ("fr") || word.startsWith ("st") ||
                word.startsWith ("gl") || word.startsWith ("sw") ||
                word.startsWith ("gr") || word.startsWith ("th") ||
                word.startsWith ("kl") || word.startsWith ("tr") ||
                word.startsWith ("ph") || word.startsWith ("tw") ||
                word.startsWith ("pl") || word.startsWith ("wh") ||
                word.startsWith ("pr") || word.startsWith ("wr") );
    }

}