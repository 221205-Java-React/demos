package com.revature.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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

        log.info(jp.getTarget() + " invoked " + jp.getSignature() + " returning " + returnedObject);
    }

}
