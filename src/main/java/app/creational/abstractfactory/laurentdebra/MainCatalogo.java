package app.creational.abstractfactory.laurentdebra;

import app.creational.abstractfactory.laurentdebra.fabrica.FabricaVehiculo;
import app.creational.abstractfactory.laurentdebra.fabrica.FabricaVehiculoElectricidad;
import app.creational.abstractfactory.laurentdebra.fabrica.FabricaVehiculoGasolina;
import app.creational.abstractfactory.laurentdebra.productoAbstractoA.Automovil;
import app.creational.abstractfactory.laurentdebra.productoAbstractoB.Scooter;

import java.util.Scanner;

public class MainCatalogo {

    public static int nAutos = 3;
    public static int nScooters = 2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FabricaVehiculo fabrica;
        Automovil[] autos = new Automovil[nAutos];
        Scooter[] scooters = new Scooter[nScooters];

        System.out.print("Seleccione: [1] Vehículos eléctricos o [2] a gasolina = ");
        String eleccion = sc.next();

        if (eleccion.equals("1")) {
            fabrica = new FabricaVehiculoElectricidad();
        } else {
            fabrica = new FabricaVehiculoGasolina();
        }

        for (int i = 0; i < nAutos; i++) {
            autos[i] = fabrica.creaAutomovil("estándar", "amarillo", 6 + i, 3.2);
        }

        for (int i = 0; i < nScooters; i++) {
            scooters[i] = fabrica.creaScooter("clásico", "rojo", 2 + i);
        }

        for (Automovil auto : autos) {
            auto.mostrarCaracteristicas();
        }

        for (Scooter scooter : scooters) {
            scooter.mostrarCaracteristicas();
        }
    }
}
