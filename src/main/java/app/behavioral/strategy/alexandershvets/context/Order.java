package app.behavioral.strategy.alexandershvets.context;

import app.behavioral.strategy.alexandershvets.strategies.PayStrategy;

/**
 * Esta clase no conoce el método de pago concreto (estrategia)
 * que ha elegido el usuario. Utiliza una interfaz de estrategia
 * común para delegar la recopilación de datos de pago al objeto
 * de estrategia.
 * Se puede usar para guardar el pedido en la base de datos.
 */
public class Order {

    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        //Aquí podríamos recopilar y almacenar datos de pago de la estrategia
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }
}
