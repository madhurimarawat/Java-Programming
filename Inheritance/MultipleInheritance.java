// Interface 1
interface Interface1 {

    // Abstract method in Interface1
    void method1();
}

// Interface 2
interface Interface2 {

    // Abstract method in Interface2
    void method2();
}

// Implementing class that inherits from both Interface1 and Interface2
class MultipleInheritanceClass implements Interface1, Interface2 {
    
    @Override
    public void method1() {
        System.out.println("Implementation of method1 from Interface1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation of method2 from Interface2");
    }
}

public class MultipleInheritance{

    public static void main(String[] args) {

        // Create an instance of MultipleInheritanceClass
        MultipleInheritanceClass obj = new MultipleInheritanceClass();

        // Call method1 from Interface1
        obj.method1();
        
        // Call method2 from Interface2
        obj.method2();
    }
}
