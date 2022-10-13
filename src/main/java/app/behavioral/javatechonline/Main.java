package app.behavioral.javatechonline;

import app.behavioral.javatechonline.strategy.BubbleSort;
import app.behavioral.javatechonline.strategy.QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {6, 9, 7, 4, 8};

        //Podemos proporcionar cualquier estrategia para hacer el ordenamiento
        Context context = new Context(new BubbleSort());
        context.arrange(numbers);


        //Podemos cambiar la estrategia sin cambiar la clase de contexto
        context = new Context(new QuickSort());
        context.arrange(numbers);
    }
}
