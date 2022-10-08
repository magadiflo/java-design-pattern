package app.creational.factory.javatechonline;

public class MainFactory {
    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();

        Lenovo lenovo = (Lenovo) factory.createMobile("lenovo");
        lenovo.batteryPower();

        Samsung samsung = (Samsung) factory.createMobile("samsung");
        samsung.batteryPower();
    }
}
