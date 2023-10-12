// Printing Hello world in Java
// Java is an object oriented programming language thus every program should have atleast one class

// Creating Class for printing hello world
// Name of class should match with name of source code file 
public class HelloWorld {

    // Main function 
    // Entry point in a java program
    // public keyword indicates that it is accessible from outside the class
    // static keyword means that the method belongs to class itself not to an instance of class
    // void means it does not return any argument
    // main method takes an array of string as parameter
    // This allows to pass arguments to program from command line
    public static void main(String[] args){

        // To print output
        System.out.println("Hello World!");
    }
}
/* The execution process of java code is as follows
 First we give the command javac sourcecode.java to make a byte class file which will be executed using java.
 then this file is executed with the command java classname and finally we have output in the command prompt.
 */