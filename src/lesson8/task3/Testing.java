package lesson8.task3;

public class Testing {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("John");
        employee.setAge(25);
        employee.setPhoneNumber("25555555");
        employee.setAddress("Address 5 street 5");
        employee.setSalary(900.50);

        Manager manager = new Manager();
        manager.setName("Don");
        manager.setAge(39);
        manager.setPhoneNumber("52222222");
        manager.setAddress("Address 19 street 19");
        manager.setSalary(1500);


        System.out.println(employee);
        System.out.println(manager);

    }
}
