package app.behavioral.strategy.alexandershvets;

import app.behavioral.strategy.alexandershvets.context.Order;
import app.behavioral.strategy.alexandershvets.strategies.PayByCreditCard;
import app.behavioral.strategy.alexandershvets.strategies.PayByPayPal;
import app.behavioral.strategy.alexandershvets.strategies.PayStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;
            do {
                System.out.printf("Please, select a producto: %n[1] Mother board %n[2] CPU %n[3] HDD %n[4] Memory %n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);

                System.out.println("Count: ");
                int count = Integer.parseInt(reader.readLine());

                order.setTotalCost(cost * count);

                System.out.printf("Do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("y"));

            if (strategy == null) {
                System.out.printf("Please, select a payment method: %n[1] PayPal %n[2] Credit Card %n");
                String paymentMethod = reader.readLine();

                /**
                 * El cliente crea diferentes estrategias basadas en la entrada del usuario, la configuración
                 * de la aplicación, etc.
                 * */
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }
            /**
             * Los delegados del objeto de pedido recopilan datos de pago para el objeto de estrategia,
             * ya que solo las estrategias saben qué datos necesitan para procesar un pago.
             * */
            order.processOrder(strategy);

            System.out.printf("Pay %d units or continue shopping? P/C: ", order.getTotalCost());
            String proceed = reader.readLine();

            if (proceed.equalsIgnoreCase("P")) {
                //Finalmente, la estrategia maneja el pago
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("Fail!, please, check your data");
                }
                order.setClosed(true);
            }


        }
    }
}
