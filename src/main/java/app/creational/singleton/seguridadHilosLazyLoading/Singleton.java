package app.creational.singleton.seguridadHilosLazyLoading;

/**
 * Singleton con seguridad en los hilos y carga diferida (Lazy Loading)
 * ********************************************************************
 * Para arreglar el problema del ejemplo situado en el package
 * singleton/multiHilo,
 * debemos sincronizar hilos durante la primera creación del objeto Singleton
 */
public class Singleton {
    //El campo debe declararse volatile para que el bloqueo de doble verificación funcione correctamente
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        /**
         * El enfoque adoptado aquí se denomina bloqueo de doble comprobación (DCL).
         * Existe para evitar la condición de carrera entre múltiples subprocesos que
         * pueden intentar obtener una instancia única al mismo tiempo, creando
         * instancias separadas como resultado.
         *
         * Puede parecer que tener la variable 'resultado' aquí no tienen ningún sentido.
         * Sin embargo, hay una advertencia muy importante al implementar el bloqueo de
         * verificación doble en java, que se resuelve introduciendo esta variable local.
         * */
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }

}
