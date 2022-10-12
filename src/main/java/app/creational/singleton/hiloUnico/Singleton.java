package app.creational.singleton.hiloUnico;

/**
 * Es muy fácil implementar un Singleton descuidado. Tan solo necesitas esconder
 * el constructor e implementar un método de creación estático.
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
