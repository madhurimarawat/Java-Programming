public class ConditionalExample {
    public static void main(String[] args) {
        // Define a variable
        int number = 10;

        // Check if the number is greater than 5
        if (number > 5) {
            // If true, print this message
            System.out.println("The number is greater than 5.");
        } else {
            // If false, print this message
            System.out.println("The number is not greater than 5.");
        }

        // Check if the number is even or odd
        if (number % 2 == 0) {
            // If true, print this message
            System.out.println("The number is even.");
        } else {
            // If false, print this message
            System.out.println("The number is odd.");
        }

        // Check multiple conditions using else if
        if (number < 0) {
            System.out.println("The number is negative.");
        } else if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
