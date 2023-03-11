import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> history = new ArrayList<>();
        
        while(true) {
            
            // Display menu
            System.out.println("\nWelcome to Calculator\n");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Show history");
            System.out.println("6. Exit");
            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();
            
            // Perform selected operation
            switch(choice) {
            
                case 1:
                    System.out.print("\nEnter first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = scanner.nextDouble();
                    double sum = num1 + num2;
                    System.out.println("\nSum = " + sum);
                    history.add(num1 + " + " + num2 + " = " + sum);
                    break;
                
                case 2:
                    System.out.print("\nEnter first number: ");
                    double num3 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num4 = scanner.nextDouble();
                    double diff = num3 - num4;
                    System.out.println("\nDifference = " + diff);
                    history.add(num3 + " - " + num4 + " = " + diff);
                    break;
                
                case 3:
                    System.out.print("\nEnter first number: ");
                    double num5 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double num6 = scanner.nextDouble();
                    double product = num5 * num6;
                    System.out.println("\nProduct = " + product);
                    history.add(num5 + " * " + num6 + " = " + product);
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
                    double quotient = num7 / num8;
                    System.out.println("\nQuotient = " + quotient);
                    history.add(num7 + " / " + num8 + " = " + quotient);
                    break;
                
                case 5:
                    if(history.isEmpty()) {
                        System.out.println("\nNo history available");
                        break;
                    }
                    System.out.println("\nHistory:");
                    for(String entry : history) {
                        System.out.println(entry);
                    }
                    break;
                
                case 6:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("\nInvalid choice");
            
            }
        }
    }
}
