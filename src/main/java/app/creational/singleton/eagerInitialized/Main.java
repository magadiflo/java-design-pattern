package app.creational.singleton.eagerInitialized;

public class Main {
    public static void main(String[] args) {
        System.out.println("Si se ve el mismo valor, entonces se reutilizó singleton.");
        System.out.println("Si se ven valores distintos, entonces se crearon 2 singleton. (no puede ser!)");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());

        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.hashCode());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton.hashCode());
        }
    }
}