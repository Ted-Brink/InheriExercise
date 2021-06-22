package se.lexicon.tedBrink;

public class Motorcycle extends Vehicle{
    String motorcycleType;


    public Motorcycle(String regNr, String brand, String motorcycleType) {
        super(regNr, brand);
        this.motorcycleType = motorcycleType;
    }

    public String getMotorcycleType() {
        return motorcycleType;
    }

    public void setMotorcycleType(String motorcycleType) {
        this.motorcycleType = motorcycleType;
    }

    @Override
    void drive() {
        System.out.println("Riding motorbike");
    }


    @Override
    public String toString() {
        return "Motorcycle{regnr " + getRegNr() + ", brand " + getBrand() +
                ", motorcycletype " + motorcycleType +
                '}';
    }

}
