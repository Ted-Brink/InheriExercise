package se.lexicon.tedBrink;

public abstract class Vehicle {
    private int IdSequenser = 0;

    private String regNr;
    private String brand;
    private int Id;

    public Vehicle(String regNr, String brand) {
        this.Id = ++IdSequenser;
        this.regNr = regNr;
        this.brand = brand;
    }

    public int getIdSequenser() {
        return IdSequenser;
    }


    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    abstract void drive();
}
