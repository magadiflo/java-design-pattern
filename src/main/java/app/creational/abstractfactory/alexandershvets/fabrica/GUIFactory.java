package app.creational.abstractfactory.alexandershvets.fabrica;

import app.creational.abstractfactory.alexandershvets.productoAbstractoA.Button;
import app.creational.abstractfactory.alexandershvets.productoAbstractoB.CheckBox;

public interface GUIFactory {

    Button createButton();

    CheckBox createCheckBox();

}
