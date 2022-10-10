package app.creational.abstractfactory.javatechonline;

public class MobileFactory implements IMobileFactory {

    @Override
    public IMobileFactory createMobile(String type) {
        IMobileFactory mob = null;
        if (type.equals("lenovo-factory")) {
            mob = new LenovoMobileFactory();
        } else if (type.equals("samsung-factory")) {
            mob = new SamsungMobileFactory();
        }
        return mob;
    }

}
