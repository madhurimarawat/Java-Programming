// Variables in Java
/*
 In Java, variables are used to store data that can be manipulated and used within a program.
Variables have a data type, a name, and a value
Java is a statically-typed language, which means that every variable must have a specific 
data type that determines the kind of data it can hold
Main Datatypes in Java are- 
int: Represents integer values.
double: Represents floating-point (decimal) values.
char: Represents a single character.
boolean: Represents true or false values.
String: Represents a sequence of characters.

 */

public class Variables{

    // Main function
    public static void main(String [] args){

        System.out.println("Variables in Java");

        // Integer Variable - Holds integer values
        int age=24;
        System.out.println("Integer Variable is: "+age);

        // Double variable- Stores decimal values
        double percent=85.235;
        System.out.println("Double Variable is: "+percent);

        // Char Variable
        char c = 'H';
        System.out.println("Character Variable is: "+c);

        // Boolean Variable
        boolean b = true;
        System.out.println("Boolean Variable is: "+b);


        // String Variable
        String messge="Hello";
        System.out.println("String Variable is:"+messge);
    }
}