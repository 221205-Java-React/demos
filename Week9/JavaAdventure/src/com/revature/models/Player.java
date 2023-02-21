package com.revature.models;

public class Player implements IPlayer{

    private String name;
    private String weapon = "No Weapon";
    private String armor = "No Armor";
    private static int health = 100;

    @Override
    public void fight() {
        System.out.println(name + " is fighting with " + weapon + " wearing " + armor);
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

    public Player(String name, String weapon, String armor, int health) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
