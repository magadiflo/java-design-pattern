package app.creational.singleton.eagerInitialized;

/**
 * Eager initialization
 * *********************
 * En la inicialización ansiosa, la instancia de la clase Singleton se crea en el momento
 * de la carga de clases, este es el método más fácil para crear una clase singleton,
 * pero tiene el inconveniente de que la instancia se crea aunque la aplicación cliente
 * no la esté utilizando.
 * <p>
 * Si su clase singleton no está usando muchos recursos, este es el enfoque a usar.
 * Pero en la mayoría de los escenarios, las clases Singleton se crean para recursos como
 * el sistema de archivos, las conexiones de base de datos, etc. Debemos evitar la
 * instanciación hasta que el cliente llame al método getInstance(). Además, este método
 * no proporciona ninguna opción para el manejo de excepciones.
 */

public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return Singleton.INSTANCE;
    }

}
