package lv.liza.rocketscience;

public class Engine {

    private String name;
    private String fuelType;
    private int engineSize;
    private double fuelConsumption;

    public Engine() {
    }

    public Engine(String name, String fuelType, int engineSize, double fuelConsumption) {
        this.name = name;
        this.fuelType = fuelType;
        this.engineSize = engineSize;
        this.fuelConsumption = fuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
