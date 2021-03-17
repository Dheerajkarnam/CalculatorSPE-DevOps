import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);
    public static void main(String[] args) throws IOException {
        System.out.println("Calculator SPE mini project");
        while(true) {
            System.out.println("Please Enter your choice:");
            System.out.println("For square root Enter 1:");
            System.out.println("For factorial Enter 2:");
            System.out.println("For logarithm Enter 3:");
            System.out.println("For power Function Enter 4:");
            System.out.println("Press any other key to exit");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int choice;
            choice = Integer.parseInt(br.readLine());
            if (choice == 1) {
                System.out.println("enter the number to calculate square root: ");
                double num = Double.parseDouble(br.readLine());
                double result= getSquareRoot(num);
                if(result>=0)
                    System.out.println("square root of "+num+" is: "+result);
                else
                    System.out.println("square root not possible for this number");
                System.out.println("====================================================");
            }
            else if (choice == 2) {
                System.out.println("enter the number to calculate factorial: ");
                int num = Integer.parseInt(br.readLine());
                if(num >= 0){
                    System.out.println("factorial of "+num+" is: "+getFactorial(num));
                }
                else
                    System.out.println("factorial not possible for this number");
                System.out.println("====================================================");
            }
            else if (choice == 3) {
                System.out.println("enter the number to calculate logarithm(base e): ");
                double num = Double.parseDouble(br.readLine());
                if(num>0)
                    System.out.println("natural log value of "+num+" is: "+getLogarithm(num));
                else if(num == 0)
                    System.out.println("log value is"+Double.NEGATIVE_INFINITY);
                else
                    System.out.println("Log doesn't exist");
                System.out.println("====================================================");
            }
            else if (choice == 4) {
                System.out.println("enter the base value: ");
                double base_num, exp_num;
                base_num = Double.parseDouble(br.readLine());
                System.out.println("enter the exponent value: ");
                exp_num = Double.parseDouble(br.readLine());
                System.out.println(base_num + " to the power "+exp_num+ " is: "+cal_pow(base_num, exp_num));
                System.out.println("====================================================");
            }
            else{
                System.out.println("To continue using Calculator press 1:");
                System.out.println("press any other number to exit");
                if(Integer.parseInt(br.readLine())!=1) {
                    break;
                }
            }
        }
    }
    public static double getSquareRoot(double num){
        logger.info("[SQ ROOT] - " + num);
        if(num < 0)
            return Double.NaN;

        double result = Math.sqrt(num);
        logger.info("[RESULT - SQ ROOT] - " + result);
        return result;
    }
    public static double getFactorial(int number1)
    {
        logger.info("[FACTORIAL] - " + number1);
        double result=1;
        for(int i=1;i<=number1;i++)
            result*=i;
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }
    public static double getLogarithm(double number1){
        logger.info("[NATURAL LOG] - " + number1);
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("[EXCEPTION - LOG] - Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }
    public static double cal_pow(double number1, double number2){
        if(number1==0 && number2==0)
            return Double.NaN;
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result = Math.pow(number1,number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

}