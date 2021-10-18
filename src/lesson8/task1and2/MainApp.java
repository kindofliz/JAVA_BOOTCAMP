package lesson8.task1and2;

public class MainApp {
    public static void main(String[] args) {

        //Task 1 and 2

        //Creating an object for each class
        PracticeParent parent = new PracticeParent();
        PracticeChild child = new PracticeChild();

        System.out.println("1 - method of parent class by object of parent class: ");
        parent.printParentInfo();
        System.out.println("2 - method of child class by object of child class: ");
        child.printChildInfo();

        System.out.println("3 - method of parent class by object of child class: ");
        child.printParentInfo();




    }

    public static class PracticeParent {

        //for task 2 change public to private
        public void printParentInfo() {
            System.out.println("This is parent class!");
        }
    }


    public static class PracticeChild extends PracticeParent {

        public void printChildInfo() {
            System.out.println("This is child class!");
        }
    }


}
