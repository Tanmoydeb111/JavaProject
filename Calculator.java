import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static ArrayList<String> history = new ArrayList<>();


    public static double add(double a, double b) {
        return a + b;


    }

    public static double subtract(double a, double b) {
        return a - b;



    }

    public static double multiply(double a, double b) {
        return a * b;


    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;





    }

    public static double modulus(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a % b;




    }

    public static double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Error: Cannot take square root of negative number.");
        }
        return Math.sqrt(a);




    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");
            System.out.println("6. Square Root");
            System.out.println("7. Show History");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input.");
                scanner.nextLine();
                continue;
            }
            if (choice == 8) {
                break;
            }
            if (choice == 7) {
                for (String entry : history) {
                    System.out.println(entry);
                }
                continue;
            }

            double num1=0;
            double num2 = 0;
            if(choice<=7)
            {
            try {
                System.out.print("\nEnter first number: ");
                num1 = scanner.nextDouble();
                if (choice != 6) {
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Enter Number only.");
                scanner.nextLine();
                continue;
            }
        }
            double result = 0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    history.add(num1 + " + " + num2 + " = " + result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    history.add(num1 + " - " + num2 + " = " + result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    history.add(num1 + " * " + num2 + " = " + result);
                    break;
                case 4:
                    try {
                        result = divide(num1, num2);
                        history.add(num1 + " / " + num2 + " = " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    break;
                case 5:
                    try {
                        result = modulus(num1, num2);
                        history.add(num1 + " % " + num2 + " = " + result);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    break;
                case 6:
                    try {
                        result = squareRoot(num1);
                        history.add("sqrt(" + num1 + ") = " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }
            System.out.println("Result: " + result);
        }
        scanner.close();
    }

   
}
