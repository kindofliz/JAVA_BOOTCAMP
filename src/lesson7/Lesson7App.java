package lesson7;

import lv.liza.rocketscience.Engine;

import java.util.ArrayList;

public class Lesson7App {



    public static void main(String[] args) {

        SpaceShip spaceShip = new SpaceShip(new Engine(), "Escape Plan", 100);

        PeopleSpaceShip peopleSpaceShip = new PeopleSpaceShip(new Engine(), "Elon", 100, 3, new ArrayList<String>());

        //Adding people to the people arraylist in peoplespaceship
        peopleSpaceShip.getNamesOfPeople().add("Bezos");
        peopleSpaceShip.getNamesOfPeople().add("Musk");
        peopleSpaceShip.getNamesOfPeople().add("Branson");

        //Add some cargo
        peopleSpaceShip.addCargo();
        //Should return integer
        peopleSpaceShip.addCargo(200);

        System.out.println(peopleSpaceShip);

        printInfoAboutSpaceShip(spaceShip);

        //example of polymorphism (the method requires a spaceship but accepts all the children of class spaceship)
        printInfoAboutSpaceShip(peopleSpaceShip);

        //prints cargo added
        SpaceShip spaceShip2 = new SpaceShip();
        spaceShip2.addCargo();

        // virtual method example - will print the overriden method in peoplespaceship
        SpaceShip spaceShip3 = new PeopleSpaceShip();
        spaceShip3.addCargo();

    }

    //method to show an example of polymorphism
    public static void printInfoAboutSpaceShip(SpaceShip spaceShip) {
        System.out.println("I have a spaceship: " + spaceShip);
    }

}

