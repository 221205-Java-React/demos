package com.revature.models;

public class Player implements IPlayer{

    //name, weapon, armor, health (100)
    public String name = "Player1";
    public String weapon = "No Weapon";
    public String armor = "No Armor";
    public int health = 100;

    @Override
    public void fight() {
        System.out.println(name + " attacked with " + weapon + " while wearing " + armor);
    }

    @Override
    public String craft(String item, String material) {
        return material + " " + item;
    }

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, String weapon) {
        this.name = name;
        this.weapon = weapon;
    }
}
