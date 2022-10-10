package app.creational.abstractfactory.javatechonline;

public class SamsungMobileFactory extends MobileFactory {

    public Samsung createSamsungMobile() {
        return new Samsung();
    }

}
