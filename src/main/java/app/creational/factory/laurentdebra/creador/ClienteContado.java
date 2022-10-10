package app.creational.factory.laurentdebra.creador;

import app.creational.factory.laurentdebra.producto.Pedido;
import app.creational.factory.laurentdebra.producto.PedidoContado;

public class ClienteContado extends Cliente {
    @Override
    protected Pedido creaPedido(double importe) {
        return new PedidoContado(importe);
    }
}
