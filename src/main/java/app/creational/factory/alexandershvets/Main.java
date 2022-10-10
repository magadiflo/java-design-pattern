package app.creational.factory.alexandershvets;

import app.creational.factory.alexandershvets.creador.Dialog;
import app.creational.factory.alexandershvets.creador.HTMLDialog;
import app.creational.factory.alexandershvets.creador.WindowsDialog;

public class Main {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HTMLDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
