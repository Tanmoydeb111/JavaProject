import java.util.ArrayList;
import java.util.Scanner;


public class Calculator {


    public class his {
        public static ArrayList<String> history = new ArrayList<>();
      }

    

    public static void addition(double a,double b)
    {

        double sum = a + b;
        System.out.println("\nSum = " + sum);
        his.history.add(a + " + " + b + " = " + sum);
        
    }

    public static void sub(double a,double b)
    {
        double diff = a - b;
        System.out.println("\nDifference = " + diff);
        his.history.add(a + " - " + b + " = " + diff);
    }


    public static void div(double a,double b)
    {
        double quotient = a / b;
        System.out.println("\nQuotient = " + quotient);
        his.history.add(a + " / " + b + " = " + quotient);
    }

    public static void mul(double a,double b)
    {
        double product = a * b;
        System.out.println("\nProduct = " + product);
        his.history.add(a + " * " + b + " = " + product);
    }


    public static void mod(double a,double b)
    {
        double product = a % b;
        System.out.println("\nModulas = " + product);
        his.history.add(a + " % " + b + " = " + product);
    }





    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            // Display menu
            System.out.println("\nWelcome to Calculator\n");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulas");
            System.out.println("6. Show history");
            System.out.println("7. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            
            switch(choice) {
            
                case 1:
                    System.out.print("\nEnter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    addition(num1, num2);
                    break;
                    
                
                case 2:
                    System.out.print("\nEnter first number: ");
                    double num3 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num4 = scanner.nextDouble();
                    sub(num3,num4);
                    break;
                
                case 3:
                    System.out.print("\nEnter first number: ");
                    double num5 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num6 = scanner.nextDouble();
                    mul(num5,num6);
                    break;
                
                case 4:
                    System.out.print("\nEnter first number: ");
                    double num7 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num8 = scanner.nextDouble();
                    if(num8 == 0) {
                        System.out.println("\nError: Division by zero");
                        break;
                    }
                    div(num7,num8);
                    break;

                case 5:
                System.out.print("\nEnter first number: ");
                double num9 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num10 = scanner.nextDouble();
                if(num10 == 0) {
                    System.out.println("\nError: Division by zero");
                    break;
                }
                mod(num9,num10);
                break;
                
                case 6:
                    if(his.history.isEmpty()) {
                        System.out.println("\nNo history available");
                        break;
                    }
                    System.out.println("\nHistory:");
                    for(String entry : his.history) {
                        System.out.println(entry);
                    }
                    break;
                
                case 7:
                    System.exit(0);
                    break;

                    
                default:
                    System.out.println("\nInvalid choice");
            
            }
        }
    }
}


