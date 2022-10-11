package app.creational.builder.alexanderdershvets.constructor;

import app.creational.builder.alexanderdershvets.producto.*;

/**
 * La interfaz constructora especifica métodos para crear
 * las distintas partes de los objetos del producto
 */
public interface Builder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
