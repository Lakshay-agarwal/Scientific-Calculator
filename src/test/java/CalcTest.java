import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalcTest
{
    private Calc calculator;

    @Before
    public void setup()
    {
        calculator = new Calc();
    }

    @Test
    public void squareRootTest1()
    {
        double a = 4;
        double expectedResult = 2;
        double result = calculator.squareRoot(a);
        assertEquals(expectedResult, result, 2.0f);
    }

    @Test
    public void squareRootTest2()
    {
        double a = 25;
        double expectedResult = 4;
        double result = calculator.squareRoot(a);
        assertNotEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void factTest1()
    {
        double a = 5;
        double expectedResult = 120;
        double result = calculator.Factorial(a);
        assertEquals(expectedResult, result, 2.0f);
    }

    @Test
    public void factTest2()
    {
        double a = 4;
        double expectedResult = 12;
        double result = calculator.Factorial(a);
        assertNotEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void natlogTest1()
    {
        double a = 2;
        double expectedResult = 0.6931;
        double result = calculator.natlog(a);
        assertEquals(expectedResult, result, 2.0f);
    }

    @Test
    public void natlogTest2()
    {
        double a = 2.718;
        double expectedResult = 2;
        double result = calculator.natlog(a);
        assertNotEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void powerTest1()
    {
        double a = 2;
        double b = 5;
        double expectedResult = 32;
        double result = calculator.power(a,b);
        assertEquals(expectedResult, result, 2.0f);
    }

    @Test
    public void powerTest2()
    {
        double a = 3;
        double b = 2;
        double expectedResult = 10;
        double result = calculator.power(a,b);
        assertNotEquals(expectedResult, result, 0.0f);
    }



}
