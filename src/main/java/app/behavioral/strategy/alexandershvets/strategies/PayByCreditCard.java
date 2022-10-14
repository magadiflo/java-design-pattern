package app.behavioral.strategy.alexandershvets.strategies;

import app.behavioral.strategy.alexandershvets.Entity.CreditCard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Concrete strategy. Implements credit card payment method.
public class PayByCreditCard implements PayStrategy {

    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard creditCard;

    @Override
    public boolean pay(int paymentAmount) {
        if (this.cardIsPresent()) {
            System.out.printf("Paying %d using Credit Card.%n", paymentAmount);
            this.creditCard.setAmount(this.creditCard.getAmount() - paymentAmount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            System.out.println("Enter the card number: ");
            String number = READER.readLine();
            System.out.println("Enter the card expiration date 'mm/yy': ");
            String date = READER.readLine();
            System.out.println("Enter the CVV code: ");
            String cvv = READER.readLine();

            this.creditCard = new CreditCard(number, date, cvv);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean cardIsPresent() {
        return this.creditCard != null;
    }

}
