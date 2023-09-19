// Program for demonstrating Command Line Arguments in java
// We need to provide arguments with the java class name else it will print else block

public class StringArguments {

      // String[] args is an array in Java that holds command-line arguments passed to a program when it is executed, allowing for dynamic input and                	customization.

	// With this we can directly give argument to out program without explicitly having to take input

    	public static void main(String[] args) {

            // It will give error at first if we do not give the number of arguments
            // We need to specify the number of arguments

            // We will add a conditional statement to do this
            if (args.length >= 3) {

                // Accessing the first argument
                String arg1 = args[0];
        
                // Accessing the second argument
                String arg2 = args[1];
        
                // Accessing the third argument
                String arg3 = args[2];
        
                // Print the arguments
                System.out.println("Argument 1: " + arg1);
                System.out.println("Argument 2: " + arg2);
                System.out.println("Argument 3: " + arg3);
    }
    else {
        System.out.println("Please Enter 3 Arguments");
    }
}
}
