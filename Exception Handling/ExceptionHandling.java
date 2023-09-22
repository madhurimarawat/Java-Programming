import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user to enter two numbers
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Perform division and display the result
            int result = divideNumbers(num1, num2);
            System.out.println("Result of division: " + result);

        } catch (ArithmeticException e) {
            // Handle the ArithmeticException (division by zero)
            System.err.println("Error: Division by zero is not allowed.");

        } catch (java.util.InputMismatchException e) {

            // Handle the InputMismatchException (non-integer input)
            System.err.println("Error: Please enter valid integers.");

        } finally {
            // Close the scanner to release resources
            scanner.close();
        }
    }

    // Method to perform division and throw an exception if the denominator is zero
    public static int divideNumbers(int numerator, int denominator) {

        if (denominator == 0) {
            // Throw an ArithmeticException if the denominator is zero
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return numerator / denominator;
    }
}
