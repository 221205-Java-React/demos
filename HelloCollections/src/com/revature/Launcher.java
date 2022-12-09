package com.revature;

import com.revature.models.Pokemon;

import java.util.ArrayList;
import java.util.HashSet;

/*
Collections are similar to Arrays BUT with different behaviors, specifically size flexibility & methods
Collections can only store objects (how do we store primitive types?? Wrapper Classes.)
*/
public class Launcher {

    public static void main(String[] args) {

        System.out.println("=======================(Lists)");

        //ArrayLists are very common implementations of the List Interface
        //QC asked me the difference between Arrays and ArrayLists

        //An ArrayList of Pokemon Objects
        ArrayList<Pokemon> pokemonList = new ArrayList();

        //add a bunch of pokemon to my ArrayList using the .add() method
        //I'm going to instantiate new Pokemon within the .add() method (could have done it separately)
        pokemonList.add(new Pokemon("Dratini", "Dragon"));
        pokemonList.add(new Pokemon("Goomy", "Dragon"));
        pokemonList.add(new Pokemon("Gengar", "Ghost/Poison"));
        pokemonList.add(new Pokemon("Treecko", "Grass"));
        pokemonList.add(new Pokemon("Breloom", "Grass/Fighting"));
        pokemonList.add(new Pokemon("Breloom", "Grass/Fighting")); //Lists can have duplicates

        //now we've added a bunch of Pokemon, let's try to print it out
        System.out.println(pokemonList);

        //I want to get the 4th pokemon in the List
        System.out.println(pokemonList.get(3));

        //we can use .size() to return the length of List
        System.out.println("I have " + pokemonList.size() + " pokemon");

        //we can use .forEach to do something for every Pokemon in the List
        pokemonList.forEach(pokemon -> pokemon.fight());
        /*
        What the heck
        "FOR EACH object (which we'll call pokemon) in the ArrayList, call the fight() method"
        What is the arrow -> ?? this is called a lambda
        Basically, you provide a value, and use that value in some expression. Like a shortcut method
        In this case, we're providing a pokemon and making it fight
        */

        //Definitely look into other List methods, these are just a few of them.


        System.out.println("=======================(Sets)");

        //Instantiate an empty HashSet, which imo is the most general use Set
        HashSet<Pokemon> pokemonSet = new HashSet();

        pokemonSet.add(new Pokemon("Dratini", "Dragon"));
        pokemonSet.add(new Pokemon("Goomy", "Dragon"));
        pokemonSet.add(new Pokemon("Gengar", "Ghost/Poison"));
        pokemonSet.add(new Pokemon("Treecko", "Grass"));

        //while Java will let you TRY to include duplicates, they won't be shown when we print
        Pokemon breloom = new Pokemon("Breloom", "Grass/Fighting");
        pokemonSet.add(breloom);
        pokemonSet.add(breloom);

        //note that these don't print in the order they were added. Sets are not ordered
        System.out.println(pokemonSet);

        //lastly, I want to show an enchanced for loop - a quick way to loop through data
        //"For every Pokemon object (called p), in the pokemonSet, print it out"
        for(Pokemon p : pokemonSet) {
            System.out.println(p);
        }

        //thanks to the hashCode & equals boilerplate code, we can compare our pokemon

        Pokemon breloom2 = new Pokemon("Breloom", "Grass/Fighting");
        System.out.println(breloom.equals(breloom2)); //different objects, but same values == true

        System.out.println(breloom == breloom2); //false, == compares MEMORY ADDRESS

    }

}
