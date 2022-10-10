package app.creational.abstractfactory.javatechonline;

public class Lenovo implements IMobile {

    public Lenovo() {
        System.out.println("Lenovo created");
    }

    @Override
    public void cost() {
        System.out.println("Lenovo cost starts from 10000");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Lenovo camera capacity starts from 10 MP");
    }

    @Override
    public void batteryPower() {
        System.out.println("Lenovo battery power starts from 2500MAh");
    }

}
