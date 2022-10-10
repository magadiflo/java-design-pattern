package app.creational.abstractfactory.laurentdebra.productoAbstractoB;

public class ScooterElectricidad extends Scooter {

    public ScooterElectricidad(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        String mensaje = "Scooter a electricidad de modelo: %s, color: %s, potencia: %d %n";
        System.out.printf(mensaje, this.modelo, this.color, this.potencia);
    }
}
