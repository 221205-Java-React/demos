package com.revature;

public class Calculator {

    public int sum(int x, int y){
        return x + y;
    }

    public int difference(int x, int y){
        return x - y;
    }

    public int quotient(int x, int y){
        try{
            return x / y;
        }
        catch(ArithmeticException e){
            return 0; //not because it's actually zero, but as an error return placeholder.
        }
    }

}
