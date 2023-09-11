public class NestedIfElse {
    public static void main(String[] args) {
        int age = 22; // Simulated age for demonstration

        // Check if the age is greater than or equal to 18
        if (age >= 18) {
            System.out.println("You are an adult.");

            // Nested if-else block to check if the person can drive
            boolean hasDriverLicense = true; // Simulated driver's license status

            if (hasDriverLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You are an adult but cannot drive.");
            }
        } else {
            System.out.println("You are a minor.");
        }
    }
}
