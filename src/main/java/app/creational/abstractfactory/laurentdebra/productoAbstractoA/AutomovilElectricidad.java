package app.creational.abstractfactory.laurentdebra.productoAbstractoA;

public class AutomovilElectricidad extends Automovil {

    public AutomovilElectricidad(String modelo, String color, int potencia, double espacio) {
        super(modelo, color, potencia, espacio);
    }

    @Override
    public void mostrarCaracteristicas() {
        String mensaje = "Automóvil eléctrico de modelo: %s, color: %s, potencia: %d, espacio: %.2f %n";
        System.out.printf(mensaje, this.modelo, this.color, this.potencia, this.espacio);
    }

}
