package app.creational.factory.alexandershvets.creador;

import app.creational.factory.alexandershvets.producto.Button;
import app.creational.factory.alexandershvets.producto.WindowsButton;

// Creador concreto
public class WindowsDialog extends Dialog {
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
