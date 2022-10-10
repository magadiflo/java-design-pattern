package app.creational.factory.alexandershvets.creador;

import app.creational.factory.alexandershvets.producto.Button;
import app.creational.factory.alexandershvets.producto.HTMLButton;

// Creador concreto
public class WebDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new HTMLButton();
    }
}
