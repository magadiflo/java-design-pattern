package app.creational.factory.laurentdebra.creador;

import app.creational.factory.laurentdebra.producto.Pedido;
import app.creational.factory.laurentdebra.producto.PedidoCredito;

public class ClienteCredito extends Cliente {
    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoCredito(importe);
    }
}
