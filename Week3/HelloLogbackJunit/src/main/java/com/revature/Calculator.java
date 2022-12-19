package com.revature;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {

    //Instantiating a Logger object so that we can log our application
    private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

    public int sum(int x, int y){
        logger.info("User added numbers " + x + " and " + y);
        return x + y;
    }

    public int difference(int x, int y){
        logger.info("User subtracted numbers " + x + " and " + y);
        return x - y;
    }

    public int quotient(int x, int y){
//        try{
//            logger.info("User attempted to divide numbers " + x + " and " + y);
//            return x / y;
//        }
//        catch(ArithmeticException e){
//            logger.warn("User attempted to divide by zero!!");
//            return 0; //not because it's actually zero, but as an error return placeholder.
//        }

        //the above code was for the sake of our logs^^^

        //but now, I WANT to throw an exception for the sake of our tests

        return x / y;
    }

}
