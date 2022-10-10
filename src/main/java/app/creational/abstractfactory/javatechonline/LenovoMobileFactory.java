package app.creational.abstractfactory.javatechonline;

public class LenovoMobileFactory extends MobileFactory {

    public Lenovo createLenovoMobile () {
        return new Lenovo();
    }

}
