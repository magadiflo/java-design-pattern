package app.creational.builder.javatechonline;

public class Cake {

    private final double sugar;
    private final double butter; //manteca
    private final int eggs;
    private final int vanila;
    private final double flour; //harina
    private final double bakingpowder;//Levadura en polvo
    private final double milk;
    private final int cherry; //Cereza

    public static class Builder {
        private double sugar;
        private double butter;
        private int eggs;
        private int vanila;
        private double flour;
        private double bakingpowder;
        private double milk;
        private int cherry;

        //Métodos constructores para establecer propiedades
        public Builder sugar(double cup) {
            this.sugar = cup;
            return this;
        }

        public Builder butter(double cup) {
            this.butter = cup;
            return this;
        }

        public Builder eggs(int number) {
            this.eggs = number;
            return this;
        }

        public Builder vanila(int spoon) {
            this.vanila = spoon;
            return this;
        }

        public Builder flour(double cup) {
            this.flour = cup;
            return this;
        }

        public Builder bakingpowder(double spoon) {
            this.bakingpowder = spoon;
            return this;
        }

        public Builder milk(double cup) {
            this.milk = cup;
            return this;
        }

        public Builder cherry(int number) {
            this.cherry = number;
            return this;
        }

        //Devolver el objeto de compilación completo
        public Cake build() {
            return new Cake(this);
        }
    }

    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
        this.flour = builder.flour;
        this.bakingpowder = builder.bakingpowder;
        this.milk = builder.milk;
        this.cherry = builder.cherry;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cake{");
        sb.append("sugar=").append(sugar);
        sb.append(", butter=").append(butter);
        sb.append(", eggs=").append(eggs);
        sb.append(", vanila=").append(vanila);
        sb.append(", flour=").append(flour);
        sb.append(", bakingpowder=").append(bakingpowder);
        sb.append(", milk=").append(milk);
        sb.append(", cherry=").append(cherry);
        sb.append('}');
        return sb.toString();
    }
}
