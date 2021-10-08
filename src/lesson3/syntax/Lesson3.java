package lesson3.syntax;

import lesson1.helloWorldLibrary.WorldLibrary;

public class Lesson3 {

    public static void main(String[] args) {
        RocketShip ship = new RocketShip();
        ship.fly(10);

        Bird bird = new Bird();
        bird.fly(1);

        Penguin penguin = new Penguin();
        penguin.fly(10);

        if(penguin instanceof Penguin) {
            System.out.println("Penguin is a penguin!");
        }
        if (penguin instanceof Bird) {
            System.out.println("Penguin is a Bird!");
        }


    }



    public static String boop() {
        return WorldLibrary.getName();
    }
}

enum RocketTypes {
    BEZOS,
    MUSK,
    BRANSON
}

interface CanFlyInterface {
    boolean fly(int speed);
}

class RocketShip implements CanFlyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Woosh... I am flying!");
        return false;
    }
}

class Bird implements CanFlyInterface {

    @Override
    public boolean fly(int speed) {
        System.out.println("Tweet, tweet... I am flying!");
        return false;
    }
}

class Penguin extends Bird {
    public boolean walk(int speed) {
        System.out.println("Quack!");
        return true;
    }

}