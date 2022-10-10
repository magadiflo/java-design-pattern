package app.creational.factory.laurentdebra;

public class ClienteContado extends Cliente {
    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
}
