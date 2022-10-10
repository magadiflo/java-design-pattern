package app.creational.factory.alexandershvets.creador;

import app.creational.factory.alexandershvets.producto.Button;

// Clase creadora
public abstract class Dialog {

    //Método de fábrica (Factory Method)
    protected abstract Button createButton();

    public void render() {
        Button button = this.createButton();
        button.onClick();
        button.render();
    }

}
