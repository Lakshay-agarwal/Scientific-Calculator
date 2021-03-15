import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalcTest
{
    private Calc calculator;

    @Before
    public void setup()
    {
        calculator = new Calc();
    }

    @Test
    public void squareRootTest()
    {
        double a = 4;
        double expectedResult = 2;
        double result = calculator.squareRoot(a);
        assertEquals(expectedResult, result, 2.0f);
    }

    @Test
    public void factTest()
    {
        double a = 5;
        double expectedResult = 120;
        double result = calculator.Factorial(a);
        assertEquals(expectedResult, result, 2.0f);
    }

    @Test
    public void natlogTest()
    {
        double a = 2;
        double expectedResult = 0.6931;
        double result = calculator.natlog(a);
        assertEquals(expectedResult, result, 2.0f);
    }

    @Test
    public void powerTest()
    {
        double a = 2;
        double b = 5;
        double expectedResult = 32;
        double result = calculator.power(a,b);
        assertEquals(expectedResult, result, 2.0f);
    }



}
