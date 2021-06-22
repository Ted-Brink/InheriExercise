package se.lexicon.tedBrink;

public class Truck extends Vehicle {
    int maxSpeed;
    int maxWeight;

    public Truck(String regNr, String brand, int maxSpeed, int maxWeight) {
        super(regNr, brand);
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    void drive() {
        System.out.println("The truck driver drives the truck.");
    }

    @Override
    public String toString() {
        return "Truck{" + "regnr " + getRegNr() + ", brand " + getBrand() +
                ", maxspeed=" + maxSpeed +
                ", maxweight=" + maxWeight +
                '}';
    }
}
