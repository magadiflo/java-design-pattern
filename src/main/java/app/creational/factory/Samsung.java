package app.creational.factory;

//Concrete Product B
public class Samsung implements IMobile {

    public Samsung() {
        System.out.println("Samsung created");
    }

    @Override
    public void cost() {
        System.out.println("Samsung cost starts from 6000");
    }

    @Override
    public void pictureCapacity() {
        System.out.println("Samsung camera capacity starts from 4MP");
    }

    @Override
    public void batteryPower() {
        System.out.println("Samsung battery power starts from 1200MAh");
    }

}
