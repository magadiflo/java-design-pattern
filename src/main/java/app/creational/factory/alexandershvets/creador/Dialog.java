package app.creational.factory.alexandershvets.creador;

import app.creational.factory.alexandershvets.producto.Button;

// Clase creadora
public abstract class Dialog {

    //Método de fábrica (Factory Method)
    protected abstract Button createButton();

    public void renderWindow() {
        Button button = this.createButton();
        button.render();
    }

}
