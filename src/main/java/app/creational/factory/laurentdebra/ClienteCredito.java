package app.creational.factory.laurentdebra;

public class ClienteCredito extends Cliente {
    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}
