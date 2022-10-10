package app.creational.abstractfactory.laurentdebra.productoAbstractoB;

public class ScooterGasolina extends Scooter {


    public ScooterGasolina(String modelo, String color, int potencia) {
        super(modelo, color, potencia);
    }

    @Override
    public void mostrarCaracteristicas() {
        String mensaje = "Scooter a gasólina de modelo: %s, color: %s, potencia: %d %n";
        System.out.printf(mensaje, this.modelo, this.color, this.potencia);
    }

}
