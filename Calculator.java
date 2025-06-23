import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * A simple console-based calculator that performs basic arithmetic operations:
 * addition, subtraction, multiplication, and division.
 * It interacts with the user through the console for input and output.
 */
public class Calculator {
    /**
     * The main entry point for the calculator application.
     * It handles user interaction, menu display, input parsing,
     * and calls the appropriate arithmetic methods.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Java Console Calculator!");
        while(running) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = -1;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number between 1 and 5.");
                sc.next(); // Consume the invalid input
                continue; // Restart the loop
            }
            if (choice == 5) {
                System.out.println("Exiting calculator. Goodbye!");
                running = false;
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                continue; // Restart the loop
            }

            double num1 = 0;
            double num2 = 0;

            try{
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
                sc.next(); // Consume the invalid input
                continue; // Restart the loop
            }

            double result = 0;

            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.printf("Result: %.5f + %.5f = %.5f%n", num1, num2, result); // Using printf for formatted output
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.printf("Result: %.5f - %.5f = %.5f%n", num1, num2, result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.printf("Result: %.5f * %.5f = %.5f%n", num1, num2, result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = divide(num1, num2);
                        System.out.printf("Result: %.5f / %.5f = %.5f%n", num1, num2, result); // Using printf for formatted output
                    }
                    break;
                default:
                    // This case should ideally not be reached due to earlier validation
                    System.out.println("An unexpected error occurred.");
            }
        }
        sc.close();
    }

    // Method for addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method for division
    public static double divide(double a, double b) {
        // Assume b is not zero, as already checked
        return a / b;
    }
}
