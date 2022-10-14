package app.behavioral.strategy.javatechonline;

import app.behavioral.strategy.javatechonline.strategy.Strategy;

//Un objeto que utiliza un objeto Strategy a menudo se denomina objeto de contexto
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(int[] input) {
        this.strategy.sort(input);
    }
}
