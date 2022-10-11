package app.creational.builder.alexanderdershvets.director;

import app.creational.builder.alexanderdershvets.constructor.Builder;
import app.creational.builder.alexanderdershvets.producto.*;

/**
 * El director solo es responsable de ejecutar los pasos de construcción en una
 * secuencia particular. Resulta útil cuando se crean productos de acuerdo con
 * un orden o configuración específicos. En sentido estricto, la clase directora
 * es opcional, ya que el cliente puede controlar directamente los
 * objetos constructores.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }


}
