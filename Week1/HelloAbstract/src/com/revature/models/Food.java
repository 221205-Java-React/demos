package com.revature.models;

/*This is an Interface, which contain fields and abstract methods
  The fields can be initialized or uninitialized, but the methods are abstract (usually)
  Interfaces are meant to be implemented by Classes, which give functionality to the abstract methods
  The reason Interfaces are called "contracts" is that implementing MUST define the method bodies
*/
public interface Food {

    //Interface variables are public, static, final by default.
    boolean isEdible = true;

    //Abstract method - no method body! public abstract by default
    void getEaten();

    /*
    every Food should be able to get eaten. However, different foods will get eaten different ways
    the job of an interface is to LAY OUT behaviors, but not how to perform that behavior
    "how to perform" is the job of the Class that implements the interface
    */

    //another abstract method, this one takes a parameter - how many days til you throw it out
    void throwAway(int days);

    //Java recently allowed us to declare concrete methods in interfaces using the "default" keyword
    //I never do this

}
