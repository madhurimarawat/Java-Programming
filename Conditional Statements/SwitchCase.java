// Class for switch case
public class SwitchCase{

    // Main function
   // This is where the execution of function begins
    public static void main(String [] args){

        // Declaring a variable
        // Dosen't work for double data type  and comparison with int data type
        // Say we declare a double variable and compare it with int it will give error
        int day = 4;

        // Printing statement based on condition using switch case
        // It is very important to add break after each case statement else it will execute all statement after that case
        switch(day){
            case 1:
            System.out.println("Day is Monday"); break;
            case 2:
            System.out.println("Day is Tuesday");break;
            case 3:
            System.out.println("Day is Wednesday");break;
            case 4:
            System.out.println("Day is Thursday");break;
            case 5:
            System.out.println("Day is Friday");break;
            case 6:
            System.out.println("Day is Saturday");break;
            default:
            System.out.println("Day is Sunday");
        }

    }
}