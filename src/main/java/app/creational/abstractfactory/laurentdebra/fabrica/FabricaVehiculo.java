package app.creational.abstractfactory.laurentdebra.fabrica;

import app.creational.abstractfactory.laurentdebra.productoAbstractoA.Automovil;
import app.creational.abstractfactory.laurentdebra.productoAbstractoB.Scooter;

public interface FabricaVehiculo {

    Automovil creaAutomovil(String modelo, String color, int potencia, double espacio);

    Scooter creaScooter(String modelo, String color, int potencia);

}
