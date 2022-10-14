package app.behavioral.strategy.alexandershvets.strategies;

/**
 * Medio de pago en una aplicación de comercio electrónico
 * *******************************************************
 * En este ejemplo, el patrón Strategy se utiliza para implementar los distintos medios
 * de pago de una aplicación de comercio electrónico. Una vez seleccionado el producto a comprar,
 * un cliente elige un medio de pago: Paypal o tarjeta de crédito.
 * <p>
 * Las estrategias concretas no solo realizan el propio pago, sino que además alteran el
 * comportamiento del formulario de pago, proporcionando campos adecuados para el registro
 * de los datos del pago.
 */


//Common interface for all strategies.
public interface PayStrategy {

    boolean pay(int paymentAmount);

    void collectPaymentDetails();

}
