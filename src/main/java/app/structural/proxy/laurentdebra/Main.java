package app.structural.proxy.laurentdebra;

import app.structural.proxy.laurentdebra.proxy.AnimacionProxy;
import app.structural.proxy.laurentdebra.sujeto.Animacion;

public class Main {
    public static void main(String[] args) {
        Animacion animacion = new AnimacionProxy();
        animacion.dibuja();
        animacion.click();
        animacion.dibuja();
    }
}
