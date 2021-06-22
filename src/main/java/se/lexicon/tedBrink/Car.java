package se.lexicon.tedBrink;

public class Car extends Vehicle{
    int numberDoors;
    int numberPassenger;
    String colour;




    public Car(String regNr, String brand, int numberDoors, int numberPassenger, String colour) {
        super(regNr, brand);
        this.numberDoors = numberDoors;
        this.numberPassenger = numberPassenger;
        this.colour = colour;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public int getNumberPassenger() {
        return numberPassenger;
    }

    public void setNumberPassenger(int numberPassenger) {
        this.numberPassenger = numberPassenger;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    void drive(){
        System.out.println("Car is driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "regnr " + getRegNr() + ", " +
                "brand " + getBrand() + ", " +
                "numberDoors " + numberDoors + ", " +
                "numberPassenger " + numberPassenger + ", " +
                "colour " + colour +
                '}';
    }
}
