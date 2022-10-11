package app.creational.builder.alexanderdershvets.constructor;

import app.creational.builder.alexanderdershvets.producto.*;

/**
 * Las clases constructoras concretas siguen la interfaz constructora
 * y proporcionan implementaciones específicas de los pasos de construcción.
 * Tu programa puede tener multitud de variaciones de objetos constructores,
 * cada una de ellas implementada de forma diferente
 */
public class CarBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(this.type, this.seats, this.engine, this.transmission, this.tripComputer, this.gpsNavigator);
    }
}
