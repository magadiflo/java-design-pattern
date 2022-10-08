package app.creational.factory;

// Creator
public class MobileFactory {

    public IMobile createMobile(String type) {
        IMobile mobile = null;
        if (type.equalsIgnoreCase("lenovo")) {
            mobile = new Lenovo();
        } else if (type.equalsIgnoreCase("samsung")) {
            mobile = new Samsung();
        }
        return mobile;
    }

}
