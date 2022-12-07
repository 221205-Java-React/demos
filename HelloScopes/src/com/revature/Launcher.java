package com.revature;

public class Launcher {

    //This is a Class scoped primitive variable *Note the "static" keyword which makes it Class scoped
    //We'll immediately assign it a value of 5 during declaration (INITIALIZING the variable)
    public static int i = 5;

    //This is another Class scoped primitive, but it's UNINITIALIZED, because we didn't give it a value
    public static int i2;

    //This is a Class scoped uninitialized reference variable
    public static Launcher launcher; //since it's uninitialized, no constructor needed yet
    //Yes, this is a Launcher object within the Launcher Class. This is legal! And sometimes necessary

    //This is an instance scoped variable *Note the lack of the "static" keyword
    public double dub = 16.4;

    /* BIG PICTURE?

     Each instance of the Launcher Class will have its own specific value for the dub variable (instance scoped)
     Each instance of the Launcher Class will share a value for i and i2 (class scoped)

     This is one of the main reasons we may or may not want to use "static"

     If you change the value of static variable, that change will happen to all object of the class
     If you change the value of instance variable, that change will happen ONLY to the object it changed in

    */

    public static void main(String[] args) {


    }

}
