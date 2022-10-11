package app.creational.builder.javatechonline;

public class Main {
    public static void main(String[] args) {
        //Creando objeto usando el patrón Builder (una forma/versión distinta)
        Cake cake = new Cake.Builder().sugar(1).butter(0.5).milk(0.5).build();
        System.out.println(cake);
    }
}
