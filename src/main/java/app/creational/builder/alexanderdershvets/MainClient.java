package app.creational.builder.alexanderdershvets;

import app.creational.builder.alexanderdershvets.constructor.CarBuilder;
import app.creational.builder.alexanderdershvets.constructor.CarManualBuilder;
import app.creational.builder.alexanderdershvets.director.Director;
import app.creational.builder.alexanderdershvets.producto.Car;
import app.creational.builder.alexanderdershvets.producto.Manual;

/**
 * El código cliente crea un objeto constructor, lo pasa al director
 * y después inicia el proceso de construcción.
 * El resultado final se extrae del objeto constructor.
 */
public class MainClient {
    public static void main(String[] args) {
        Director director = new Director();

        //Construyendo un objeto carro
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car car = carBuilder.getResult();
        System.out.println("Car build: \n" + car.getCarType());

        //Construyendo un objeto manual
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual manual = manualBuilder.getResult();
        System.out.println("\nCar manual build: \n" + manual.print());
    }
}
