import com.revature.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTests {

    //uninitialized Calculator Class
    public static Calculator calc;

    @BeforeClass //I want this to run BEFORE ANYTHING in the Class happens
    public static void initialize(){
        calc = new Calculator();
    }

    @AfterClass //I want this to run AFTER EVERYTHING in the Class happens
    public static void uninitialize(){
        calc = null;
    }

    @Test //without the @Test annotation, this method will not be recognized as a runnable Test.
    public void testAddition(){
        int result = calc.sum(5, 15);
        assertEquals(result, 20);
    }

    @Test
    public void testSubtraction(){
        int result = calc.difference(20, 10);
        assertTrue(result == 10);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero(){
        calc.quotient(5, 0);
    }

}
