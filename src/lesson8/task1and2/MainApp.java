package lesson8.task1and2;

public class MainApp {
    public static void main(String[] args) {

        //Task 1 and 2

        //Creating an object for each class
        PracticeParent parent = new PracticeParent();
        PracticeChild child = new PracticeChild();

        //1 - method of parent class by object of parent class:
        parent.printParentInfo();
        //2 - method of child class by object of child class:
        child.printChildInfo();

        //3 - method of parent class by object of child class:
        child.printParentInfo();

        //Task 2
        //If the parent method is changed to private, it's impossible to call from main class




    }

}
