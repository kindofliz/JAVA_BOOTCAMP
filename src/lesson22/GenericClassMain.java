package lesson22;

import java.util.Date;

public class GenericClassMain {
    public static void main(String[] args) {

        GenericClass<String> firstDate = new GenericClass<>();

        firstDate.setBirthDate("2021-11-15");
        System.out.println(firstDate.getBirthDate());
        firstDate.formatBirthDate("Some string");

        GenericClass<Date> secondDate = new GenericClass<>();
        secondDate.setBirthDate(new Date());
        System.out.println(secondDate.getBirthDate());
        secondDate.formatBirthDate(new Date());






    }
}
