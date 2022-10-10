package app.creational.factory.alexandershvets;

import app.creational.factory.alexandershvets.creador.Dialog;
import app.creational.factory.alexandershvets.creador.WebDialog;
import app.creational.factory.alexandershvets.creador.WindowsDialog;

public class Main {
    public static void main(String[] args) {
        Dialog d1 = new WebDialog();
        d1.render();

        Dialog d2 = new WindowsDialog();
        d2.render();
    }
}
