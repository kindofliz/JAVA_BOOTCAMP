package lesson22;

import java.util.Date;

public class GenericClass<T1> {

    private T1 birthDate;


    //custom GENERIC method example
    <T2> String formatBirthDate(T2 format) {
        if (format instanceof String) {
            System.out.println("It's a string");
        } else if (format instanceof Date) {
            System.out.println("This is a date");
        }
            return "result";
    }


    public T1 getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(T1 birthDate) {
        this.birthDate = birthDate;
    }
}
