package app.creational.prototype.javatechonline;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bike basicBike = bike.clone();

        Main main = new Main();
        Bike advancedBike = main.makeJaguar(basicBike);

        System.out.println("Prototype design pattern test-1: " + advancedBike.getModel());
        System.out.println("Prototype design pattern test-2: " + advancedBike.toString());
    }

    public Bike makeJaguar(Bike basicBike) {
        basicBike.makeAdvanced();
        return basicBike;
    }
}
