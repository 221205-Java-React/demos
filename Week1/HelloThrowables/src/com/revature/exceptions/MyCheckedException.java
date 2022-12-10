package com.revature.exceptions;

/*
This is a Checked Exception (aka compile time exception), because we extend Exception
So now, this Class has all the basic functionalities of any other Exception (can crash code, etc.)
If we wanted a UNCHECKED Exception, we would extend RuntimeException
 */
public class MyCheckedException extends Exception{

    //constructor - This constructor calls the super constructor from Exception
        //Constructor chaining - the constructor from Exception calls the one in Throwable

    //The whole point of this constructor is to return a String exception message (aka stack trace)
    public MyCheckedException(String message){
        super(message); //remember super(); calls the PARENTS constructor
    }

}
