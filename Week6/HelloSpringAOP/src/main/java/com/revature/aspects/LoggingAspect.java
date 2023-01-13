package com.revature.aspects;

import com.revature.models.Avenger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect //This Class is an ASPECT. We will handle all of our Logging in this one Class
public class LoggingAspect {

    //a Logger object so that we can do logging
    private static Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    //In an Aspect, methods are called ADVICES.
    //Each advice will be responsible for logging certain parts of the application

    /*This advice will create a log BEFORE any method found in the models package executes*/
    @Before("within(com.revature.models.*)")
    public void logModelMethods(JoinPoint jp){

        //getTarget() returns the class/object in question
        //getSignature() returns the method signature
        log.info(jp.getTarget() + " invoked " + jp.getSignature());

    }

    /*This advice will run AFTER successfully returning a value
    A pointcut is where advice WILL be executed
    In this case, the pointcut is any method called fight that returns a String and takes any parameters)
    the "returning" attribute is simply giving us access to the object that gets returned from fight()
      */
    @AfterReturning(pointcut="execution(String fight(..))", returning="returnedObject")
    public void logSuccessfulMethod(JoinPoint jp, Object returnedObject){
        //jp tracks whatever method we're injecting advice into
        //returnedObject lets us access the object returned by the method
        log.info(jp.getTarget() + " invoked " + jp.getSignature() + " returning " + returnedObject);
    }

    /*This advice will run AFTER and exception is THROWN in the specified pointcut*/
    @AfterThrowing(pointcut="execution(String fight(..))", throwing="thrownException")
    public void logException(JoinPoint jp, Exception thrownException){
        //jp tracks whatever method we're injecting advice into
        //thrownException lets us access the exception thrown by the method
        log.warn(jp.getTarget() + " invoked " + jp.getSignature() + " throwing " + thrownException);
    }

    /*Around is the most complicated, but most powerful annotation in AOP
    With Around, you don't need a specify a pointcut BUT we need to use ProceedingJoinPoint (not JoinPoint)
    NOTE how this one method can replace @AfterReturning and @AfterThrowing advices above */
    @Around("execution(String fight(..))")
    public void logFight(ProceedingJoinPoint pjp) throws Throwable{

        //get the Avenger object from the arguments provided in the fight() method
        Avenger a = (Avenger)pjp.getArgs()[0]; //we're getting the FIRST value of the arguments
        //we just need to cast, since getArgs can't predict the data type of the argument in question

        //log before the method even executes
        log.info(a.getAveName() + " IS ABOUT TO FIGHT");

        //get the distance value from the fight method
        double distance = (double)pjp.getArgs()[2];

        //now, we can do some control flow based on the distance (any number < 6 will throw an Exception)
        if(distance < 6){
            log.warn("FIGHT METHOD IS ABOUT TO THROW AN ARITHMETICEXCEPTION");
        } else {
            //actually let the fight method run with proceed() method
            String s = (String)pjp.proceed();
            log.info("FIGHT METHOD HAS CONCLUDED GOOD FIGHT EVERYONE");
        }

    }

}
