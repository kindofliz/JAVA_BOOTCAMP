package lesson20;

import java.util.HashMap;
import java.util.Map;

public class Lesson20Maps {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Liza", 30);
        students.get("Liza"); // returns 31
        students.containsKey(30); //returns true
        students.containsValue(30); //returns true



    }
}
