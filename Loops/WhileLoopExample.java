public class WhileLoopExample {
    public static void main(String[] args) {
        // Initialize a variable to control the loop
        int count = 1;

        // Define the condition for the while loop
        while (count <= 5) {
            // This code block will execute as long as the condition is true
            System.out.println("Iteration " + count);

            // Update the control variable to avoid an infinite loop
            count++;

            // Note: If you forget to increment count, the loop will run indefinitely.
        }

        // The loop has exited because the condition (count <= 5) is no longer true
        System.out.println("Loop finished.");
    }
}
