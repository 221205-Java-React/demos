package com.revature.models;

import java.util.Objects;

public class Pokemon extends Object{

    //variables for the Pokemon Class
    //I'm making these private for the sake of Encapsulation (One of the Pillars of OOP)
    private String name;
    private String type;

    //one method just for spice
    public void fight(){
        System.out.println(name + " is attacking!");
    }

    //BOILERPLATER CODE--------

    //constructors, getters and setters, toString, hashCode & equals

    //no-args constructor
    public Pokemon() {
        //we don't HAVE to assign default variables, we can leave it blank
    }

    //all-args constructor
    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    /*
     What are getters and setters??
     Combined with private variables, they are how we achieve ENCAPSULATION
     In a secure application, your class's variables will typically be private
     In other words, with encapsulation, you cannot ACCESS or CHANGE (get or set) these variables
        UNLESS you use getters and setters.

      When you think Encapsulation, think private variables and getters/setters
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //the toString method allows us to print out objects (and not just their memory addresses)
    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }


    //without including hashCode & equals, we would not be able to check equality of Pokemon objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(name, pokemon.name) && Objects.equals(type, pokemon.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
