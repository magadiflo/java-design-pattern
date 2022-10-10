package app.creational.abstractfactory.alexandershvets.fabrica;

import app.creational.abstractfactory.alexandershvets.productoAbstractoA.Button;
import app.creational.abstractfactory.alexandershvets.productoAbstractoA.MacButton;
import app.creational.abstractfactory.alexandershvets.productoAbstractoB.CheckBox;
import app.creational.abstractfactory.alexandershvets.productoAbstractoB.MacCheckBox;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

}
