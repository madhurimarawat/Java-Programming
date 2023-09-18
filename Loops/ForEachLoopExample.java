public class ForEachLoopExample {

    public static void main(String[] args) {

        // Creating an array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Use a for-each loop to iterate over each element in the array
        // Syntax: for (elementType elementVariable : arrayName)
        // Here, 'int' is the elementType, 'num' is the elementVariable, and 'numbers' is the arrayName

        for (int num : numbers) {

            // 'num' represents the current element in the array during each iteration
            // The loop will execute once for each element in the array

            // Print the current element to the console
            System.out.println("Current Element: " + num);

            // We can perform any operations or logic with 'num' inside the loop
            // For example, we can double the value of each element and print it
            int doubledNum = num * 2;
            System.out.println("Doubled Element: " + doubledNum);
        }

    }
}
