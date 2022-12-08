package com.revature;

public class Launcher {

    public static void main(String[] args) {

        System.out.println("========================(Throwing Some Unchecked (Runtime) Exceptions)");

        //We'll never purposefully throw exceptions We're doing it here for science

        System.out.println("Trying to divide by zero");

        //System.out.println(5/0);
        //Java let us compile, but throws an ArithmeticException at RUNTIME hence the name

        System.out.println("Trying to access an Array index that doesn't exist");

        int[] numbers = {1, 5, 3, 7}; //this Array has indexes 0 through 3

        //System.out.println(numbers[4]);
        //index 4 does not exist on this Array - ArrayIndexOutOfBoundsException

        System.out.println("========================(Exception Handling)");

        /*
        One way to handle exceptions is a TRY/CATCH block
        We will TRY to execute some code that MIGHT throw an exception
        We can have one or many CATCH blocks that will catch certain exceptions and run some code
         */

        try{
            System.out.println("Try Block Starting...");
            int j = 5/0; //Arithmetic Exception gets thrown
            System.out.println("Will I Run? NO - Because this print is AFTER the exception gets thrown");
        }
        catch (NullPointerException e){
            System.out.println("Will I Run? NO - Because an ArithmeticException is thrown. Not NullPE");
        }
        catch (ArithmeticException e){
            System.out.println("Hello from the catch block! I caught an ArithmeticException");
        }
        catch (Exception e){
            System.out.println("I could have caught any type of Exception if the other catches didn't.");
        }

        //Ben will show finally and a custom Checked exception

    }

}
