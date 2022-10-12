package app.structural.facade.javatechonline;

/**
 * Por ejemplo, vamos a crear tres clases denominadas Class1, Class2 y Class3. Luego, necesitamos simplificar la
 * interacción con este sistema de clases para que los clientes puedan interactuar con estas clases de una manera
 * simple y estandarizada. De hecho, lo haremos con la clase Fachada.
 */
public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        int x = 3;

        System.out.printf("Cubo de %d: %d %n", x, facade.cuboDeX(x));
        System.out.printf("Cubo de %d dos veces: %d %n", x, facade.cuboDeX2Veces(x));
        System.out.printf("multiplica cuboDeX(%d) por cuboDeX2Veces(%d): %d %n", x, x, facade.multiplicarAmbos(x));
    }
}
