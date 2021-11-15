package lesson21;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lesson21Deque {
    public static void main(String[] args) {

        Deque<String> myDeque = new ArrayDeque<>();

        myDeque.addFirst("1");
        myDeque.addFirst("2");
        myDeque.addFirst("3");

        //if i want to get and remove #3
        String removeElement = myDeque.removeFirst(); //3
        System.out.println(removeElement);

        //if i want get and remove #2
        removeElement = myDeque.removeFirst(); //2
        System.out.println(removeElement);

        //adding 4 on top (of 1 currently)
        myDeque.addFirst("4");

        //If i want to get #1
        removeElement = myDeque.removeLast(); //1
        System.out.println(removeElement);



    }
}
