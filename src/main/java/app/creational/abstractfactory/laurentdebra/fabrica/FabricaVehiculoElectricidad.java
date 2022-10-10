package app.creational.abstractfactory.laurentdebra.fabrica;

import app.creational.abstractfactory.laurentdebra.productoAbstractoA.Automovil;
import app.creational.abstractfactory.laurentdebra.productoAbstractoA.AutomovilElectricidad;
import app.creational.abstractfactory.laurentdebra.productoAbstractoB.Scooter;
import app.creational.abstractfactory.laurentdebra.productoAbstractoB.ScooterElectricidad;

public class FabricaVehiculoElectricidad implements FabricaVehiculo {

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilElectricidad(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterElectricidad(modelo, color, potencia);
    }

}
