package lesson20;

import java.util.ArrayList;
import java.util.List;

public class Lesson20Lists {

    public static void main(String[] args) {

        List<String> streets = new ArrayList<String>();

        streets.add("Pleksnes"); //takes index 0
        streets.get(0); //returns Pleksnes

        streets.add("Slimnicas"); //takes index 1
        streets.set(0, "Parades"); // Overwrites the street at index 0 - Pleksnes

        streets.addAll(streets); //adds the streets array into it once again
        System.out.println(streets);

    }
}
