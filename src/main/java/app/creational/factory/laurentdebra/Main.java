package app.creational.factory.laurentdebra;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new ClienteContado();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);

        cliente = new ClienteCredito();
        cliente.nuevoPedido(2000.0);
        cliente.nuevoPedido(10000.0);//Al ver la consola, se puede ver que esta solicitud cuyo valor de 10000 es rechazada
    }
}
