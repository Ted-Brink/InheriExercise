package se.lexicon.tedBrink;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Motorcycle honda = new Motorcycle("ABC123","Honda", "Touring");
        System.out.println(honda);
        honda.drive();

        Car volvo = new Car("DEF123", "Volvo", 4, 4, "Blue");
        System.out.println(volvo);
        volvo.drive();

        Truck scania = new Truck("GHI123","Scania",90, 60000);
        System.out.println(scania);
        scania.drive();





    }
}
