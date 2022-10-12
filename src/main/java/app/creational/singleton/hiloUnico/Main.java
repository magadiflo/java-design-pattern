package app.creational.singleton.hiloUnico;

public class Main {
    public static void main(String[] args) {
        System.out.println("Si ve el mismo valor, entonces se reutlizó el singleton," +
                "si se ven valores diferentes entonces se crearon 2 singletons");
        Singleton s1 = Singleton.getInstance("FOO");
        Singleton s2 = Singleton.getInstance("BAR");
        System.out.println("s1 = " + s1.value);
        System.out.println("s2 = " + s2.value);

    }
}
