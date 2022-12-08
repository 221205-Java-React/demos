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

        System.out.println("==============================(Using Class/Instance scoped Variables)");

        System.out.println(i); //prints 5, we assigned it 5
        System.out.println(i2); //prints 0, we didn't assign it any value

        System.out.println(launcher); //objects default to null if uninitialized

        //System.out.println(dub);
        //Java won't like this - you cannot call nonstatic members from within a static method

        //initializing the previously null launcher object
        launcher = new Launcher(); //remember if we don't declare a constructor, there's a default no-args

        //Since launcher was declared STATICALLY, we can use it to access its non-static variables
        //so if we use a launcher object, we are able to view and manipulate the dub variable
        System.out.println(launcher.dub);


        System.out.println("===============================(Making a new Launcher object)");

        //Brand-new Launcher object
        //launcher and launcher2 are the same data type, but they're two different objects
        Launcher launcher2 = new Launcher();

        System.out.println(launcher.i); //5
        System.out.println(launcher2.i); //5

        launcher.i = 50;

        //i is CLASS SCOPED (STATIC) so changing it in launcher also changes it in launcher2.
        //if a static variable changed in one object, it will change in every other object as well.
        System.out.println(launcher.i); //50
        System.out.println(launcher2.i); //50


        System.out.println(launcher.dub);
        System.out.println(launcher2.dub);

        launcher2.dub = 57.90;

        //dub is instance scoped, aka object scoped, aka NONSTATIC
        //so if we change it in one object, it won't affect any other objects.
        System.out.println(launcher.dub);
        System.out.println(launcher2.dub);

        System.out.println("========================(Using class/instance variables from another class)");

        //using the ScopeTesterClass to further demonstrate static/nonstatic

        //using the static variable (we don't need to instantiate a ScopeTesterClass to access a static variable
        System.out.println(ScopeTesterClass.s);

        //ScopeTesterClass.s2;
        //Java won't let you call a nonstatic on its own from within a static method

        ScopeTesterClass stc = new ScopeTesterClass();
        ScopeTesterClass stc2 = new ScopeTesterClass();

        System.out.println(stc.s2);
        System.out.println(stc2.s2);

        stc2.s2 = "Delilah";

        System.out.println(stc.s2);
        System.out.println(stc2.s2);

        System.out.println("=============================(Method/Block Scopes)");

    }

    public void testStaticAccessibility(){
        System.out.println(i); //nonstatic methods can call static variables
        //static variables "belong to the class" so they're accessible anywhere in the class
    }

}
