import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
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
        if(num < 0)
            return Double.NaN;
        return Math.sqrt(num);
    }
    public static double getFactorial(int n)
    {
        if(n < 0)
            return Double.NaN;
        if (n == 0)
            return 1;
        return n*getFactorial(n-1);
    }
    public static double getLogarithm(double num){
        return Math.log(num);
    }
    public static double cal_pow(double base_num, double exp_num){
        if(base_num==0 && exp_num==0)
            return Double.NaN;
        return Math.pow(base_num, exp_num);
    }

}