package app.creational.factory.laurentdebra.producto;

public class PedidoContado extends Pedido {

    public PedidoContado(double importe) {
        super(importe);
    }

    @Override
    public boolean valida() {
        return true;
    }

    @Override
    public void paga() {
        System.out.printf("El pago del pedido (contado) por importe de %.2f se ha realizado %n", this.importe);
    }
}
