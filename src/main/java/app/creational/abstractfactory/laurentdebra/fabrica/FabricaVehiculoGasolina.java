package app.creational.abstractfactory.laurentdebra.fabrica;

import app.creational.abstractfactory.laurentdebra.productoAbstractoA.Automovil;
import app.creational.abstractfactory.laurentdebra.productoAbstractoA.AutomovilGasolina;
import app.creational.abstractfactory.laurentdebra.productoAbstractoB.Scooter;
import app.creational.abstractfactory.laurentdebra.productoAbstractoB.ScooterGasolina;

public class FabricaVehiculoGasolina implements FabricaVehiculo {

    @Override
    public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
        return new AutomovilGasolina(modelo, color, potencia, espacio);
    }

    @Override
    public Scooter creaScooter(String modelo, String color, int potencia) {
        return new ScooterGasolina(modelo, color, potencia);
    }

}
