package app.creational.singleton.multiHilo;

/**
 * Singleton Ingenuo (Multihilo)
 * *****************************
 * Este es el mismo código que se usó en clase Singleton del package /singleton/hiloUnico.
 *
 * La misma clase se comporta de forma incorrecta en un entorno de múltiples hilos (ver main).
 * Los múltiples hilos pueden llamar al método de creación de forma simultánea y
 * obtener varias instancias de la clase Singleton
 */
public class Singleton {

    private static Singleton instance;
    public String value;

    private Singleton(String value) {
        //El código siguiente emula una inicialización lenta
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (Singleton.instance == null) {
            Singleton.instance = new Singleton(value);
        }
        return Singleton.instance;
    }

}
