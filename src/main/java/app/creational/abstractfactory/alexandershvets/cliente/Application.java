package app.creational.abstractfactory.alexandershvets.cliente;

import app.creational.abstractfactory.alexandershvets.fabrica.GUIFactory;
import app.creational.abstractfactory.alexandershvets.productoAbstractoA.Button;
import app.creational.abstractfactory.alexandershvets.productoAbstractoB.CheckBox;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint() {
        this.button.paint();
        this.checkBox.paint();
    }

}
