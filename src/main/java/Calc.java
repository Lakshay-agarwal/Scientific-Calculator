import java.util.*;
import java.lang.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calc
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Scientific Calculator");
        System.out.println("");

        while(true) {
            System.out.println("(1) Square Root");
            System.out.println("(2) Factorial");
            System.out.println("(3) Natural log");
            System.out.println("(4) Power Function");
            System.out.println("(5) Exit");

            System.out.print("Enter your choice : ");
            int option = in.nextInt();

            if(option < 1 || option > 5)
                System.out.print("Incorrect option");
            else if(option == 5)
                break;
            else
            {
                System.out.print("Enter operand 1: ");
                double op1 = in.nextDouble();

                if(op1 < 0 && (option == 1 || option == 2 || option == 3))
                {
                    System.out.println("Negative operand not allowed");
                    continue;
                }

                if(option == 1)
                {
                    double result = squareRoot(op1);
                    System.out.println("Square root of " + op1 + " = " + result);
                }
                else if(option == 2)
                {
                    double result = Factorial(op1);
                    System.out.println("Factorial of " + op1 + " = " + result);
                }
                else if(option == 3)
                {
                    double result = natlog(op1);
                    System.out.println("Natural log of " + op1 + " = " + result);
                }
                else if(option == 4)
                {
                    System.out.print("Enter operand 2: ");
                    double op2 = in.nextDouble();

                    double result = power(op1,op2);
                    System.out.println(op1 + "to the power" + op2 + " = " + result);
                }
            }

        }
    }

    private static final Logger logger = LogManager.getLogger(Calc.class);

    public static double squareRoot(double a)
    {
        logger.info("Square root operation in progress..");
        return Math.sqrt(a);
    }

    public static double Factorial(double a)
    {
        logger.info("Factorial operation in progress..");
        double result = 1;

        for(int i=1;i<=a;i++)
            result *= i;

        return result;
    }

    public static double natlog(double a)
    {
        logger.info("Natural logarithm operation in progress..");
        return Math.log(a);
    }

    public static double power(double a, double b)
    {
        logger.info("Power operation in progress..");
        return Math.pow(a,b);
    }
}
