package app.creational.abstractfactory.alexandershvets.productoAbstractoB;

public class WinCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("Soy un checkBox con estilo windows!");
    }

}
