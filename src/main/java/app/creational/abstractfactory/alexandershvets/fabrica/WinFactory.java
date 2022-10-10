package app.creational.abstractfactory.alexandershvets.fabrica;

import app.creational.abstractfactory.alexandershvets.productoAbstractoA.Button;
import app.creational.abstractfactory.alexandershvets.productoAbstractoA.WinButton;
import app.creational.abstractfactory.alexandershvets.productoAbstractoB.CheckBox;
import app.creational.abstractfactory.alexandershvets.productoAbstractoB.WinCheckBox;

public class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }

}
