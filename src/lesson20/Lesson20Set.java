package lesson20;

import java.util.HashSet;
import java.util.Set;

public class Lesson20Set {
    public static void main(String[] args) {

        Set<Integer> streetNumbers = new HashSet<Integer>();

        streetNumbers.add(1);
        streetNumbers.add(5);
        streetNumbers.add(50);
        streetNumbers.add(50); //will not be added because in set element can be only once

        System.out.println(streetNumbers);

    }
}
