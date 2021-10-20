package lesson9;

public class Utilities {

    public static class Delete {
        public void delete(String fileName) {
            System.out.println("Delete");
        }
    }

    public static class Create {
        public static void createFile() {
            System.out.println("Created file");
        }
    }
}

class AnotherMainApp {
    public static void main(String[] args) {

        Utilities.Create.createFile();

    }
}
