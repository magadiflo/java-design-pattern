package app.behavioral.strategy.alexandershvets.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//Concrete strategy. Implements PayPal payment method.
public class PayByPayPal implements PayStrategy {

    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("user", "user@mail.com");
        DATA_BASE.put("test", "test@mail.com");
    }

    //Guarde los datos del cliente para futuros intentos de compra
    @Override
    public boolean pay(int paymentAmount) {
        if (this.signedIn) {
            System.out.printf("Paying %d using PayPal.%n", paymentAmount);
            return true;
        }
        return false;
    }

    @Override
    public void collectPaymentDetails() {
        try {
            while (!this.signedIn) {
                System.out.println("Enter the user's email: ");
                this.email = READER.readLine();
                System.out.println("Enter the password: ");
                this.password = READER.readLine();
                if (this.verify()) {
                    System.out.println("Data verification has been successful");
                } else {
                    System.out.println("Wrong email or password!");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean verify() {
        this.setSignedIn(this.email.equals(DATA_BASE.get(this.password)));
        return this.signedIn;
    }

    private void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

}
