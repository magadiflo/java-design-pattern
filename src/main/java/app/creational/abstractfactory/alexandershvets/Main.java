package app.creational.abstractfactory.alexandershvets;

import app.creational.abstractfactory.alexandershvets.cliente.Application;
import app.creational.abstractfactory.alexandershvets.fabrica.GUIFactory;
import app.creational.abstractfactory.alexandershvets.fabrica.MacFactory;
import app.creational.abstractfactory.alexandershvets.fabrica.WinFactory;

public class Main {
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }

    private static Application configureApplication() {
        GUIFactory factory;

        if (config().equals("Windows 10")) {
            factory = new WinFactory();
        } else {
            factory = new MacFactory();
        }

        return new Application(factory);
    }

    private static String config() {
        return System.getProperty("os.name");
    }
}
