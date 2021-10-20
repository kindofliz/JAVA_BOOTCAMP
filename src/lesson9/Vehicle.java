package lesson9;

public abstract class Vehicle {

    public abstract double calcFuelEfficiency();

    public double showCurrentSpeed() {
        return Math.random() * 100;
    }
}


class Truck extends Vehicle {

    @Override
    public double calcFuelEfficiency() {
        return 0;
    }
}

class Application {
    public static void main(String[] args) {

        Truck myTruck = new Truck();

        System.out.println(myTruck.calcFuelEfficiency());

        System.out.println(myTruck.showCurrentSpeed());
    }
}