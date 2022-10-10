package app.creational.factory.laurentdebra.producto;

public class PedidoCredito extends Pedido {

    public PedidoCredito(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return (this.importe >= 1000.0) && (this.importe <= 5000.0);
    }

    @Override
    public void paga() {
        System.out.printf("El pago del pedido a crédito de %.2f se ha realizado %n", this.importe);
    }
}
