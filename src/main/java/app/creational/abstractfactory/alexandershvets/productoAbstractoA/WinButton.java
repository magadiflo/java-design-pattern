package app.creational.abstractfactory.alexandershvets.productoAbstractoA;

public class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("Soy un botón con estilo de Windows!");
    }

}
