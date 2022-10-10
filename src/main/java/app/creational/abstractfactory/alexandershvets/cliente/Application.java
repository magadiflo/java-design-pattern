package app.creational.abstractfactory.alexandershvets.cliente;

import app.creational.abstractfactory.alexandershvets.fabrica.GUIFactory;
import app.creational.abstractfactory.alexandershvets.productoAbstractoA.Button;

public class Application {

    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = this.factory.createButton();
    }

    public void paint() {
        this.button.paint();
    }

}
