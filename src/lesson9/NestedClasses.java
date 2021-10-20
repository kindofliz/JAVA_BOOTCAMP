package lesson9;

public class NestedClasses {

    //INNER CLASS (used for security reasons, to hide parts of code)
    public static class InnerClass {
        public String printInnerClass() {
            System.out.println("This is inner class!");
        return "Some string returned";
        }
    }

    //method that accesses the inner class, creates an instance of that class and calls its method
    public String printSomethingFromNestedClass() {
        InnerClass inner = new InnerClass();
        return inner.printInnerClass();
    }

}

class MainApp {
    public static void main(String[] args) {

        NestedClasses.InnerClass inner = new NestedClasses.InnerClass();

    }
}
