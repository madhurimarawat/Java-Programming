public class DoWhileLoopExample {

    public static void main(String[] args) {

        int number;
        int sum = 0;
        
        // Initialize number to a non-zero value
        number = 5; // You can change this to any non-zero value
        
        do {
            // Add the current number to the sum
            sum += number;
            
            // Display the current sum
            System.out.println("Current sum: " + sum);
            
            // Updating the number
            number--; // We can change this to any logic to update the number
            
        } while (number != 0); // Continue the loop as long as the number is not 0
        
        // Display the final sum
        System.out.println("Final sum: " + sum);
    }
}
