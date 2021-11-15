package lesson20;

import java.util.*;

public class Lesson20Iterators {
    public static void main(String[] args) {

        //ARRAYLIST
        List<String> planets = new ArrayList<String>();

        planets.add("Earth");
        planets.add("Mars");
        planets.add("Saturn");

        Iterator planetIterator = planets.iterator();

        //print the next planet while the iterator has a next planet in the list
        while (planetIterator.hasNext()) {
            System.out.println(planetIterator.next());
        }


        //TREESET
        //A treeSet orders elements in aplhabetical etc order
        Set<String> birds = new TreeSet<String>();

        birds.add("Parrot");
        birds.add("Sparrow");
        birds.add("Pigeon");
        birds.add("Eagle");

        Iterator birdsIterator = birds.iterator();

        while (birdsIterator.hasNext()) {
            System.out.println(birdsIterator.next());
        }


        //QUEUE
        Queue<String> lidl = new LinkedList<>();

        lidl.add("A");
        lidl.add("B");
        lidl.add("C");
        System.out.println(lidl);


        Iterator lidlIterator = lidl.iterator();

        while (lidlIterator.hasNext()) {
            System.out.println(lidlIterator.next());
        }







    }
}
