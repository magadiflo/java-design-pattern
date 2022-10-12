package app.creational.prototype.javatechonline;

public class Bike implements Cloneable {

    private int gears; //engranajes
    private String bikeType;
    private String model;

    public Bike() {
        this.bikeType = "Standard";
        this.model = "Leopard";
        this.gears = 4;
    }

    public Bike clone() {
        return new Bike();
    }

    public void makeAdvanced() {
        this.bikeType = "Advanced";
        this.model = "Jaguar";
        this.gears = 6;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bike{");
        sb.append("gears=").append(gears);
        sb.append(", bikeType='").append(bikeType).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
