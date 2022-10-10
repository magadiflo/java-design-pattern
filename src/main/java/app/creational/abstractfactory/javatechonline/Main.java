package app.creational.abstractfactory.javatechonline;

public class Main {
    public static void main(String[] args) {
        IMobileFactory factory = new MobileFactory();
        LenovoMobileFactory lenovoMobileFactory = (LenovoMobileFactory) factory.createMobile("lenovo-factory");
        Lenovo lenovo = lenovoMobileFactory.createLenovoMobile();
        lenovo.pictureCapacity();
    }
}
