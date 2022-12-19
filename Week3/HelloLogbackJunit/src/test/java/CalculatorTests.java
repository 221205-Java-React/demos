import com.revature.Calculator;
import org.junit.AfterClass;
import org.junit.BeforeClass;

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



}
