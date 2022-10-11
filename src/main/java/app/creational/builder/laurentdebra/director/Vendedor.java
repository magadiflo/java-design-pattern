package app.creational.builder.laurentdebra.director;

import app.creational.builder.laurentdebra.constructor.ConstructorDocumentacionVehiculo;
import app.creational.builder.laurentdebra.producto.Documentacion;

public class Vendedor {

    protected ConstructorDocumentacionVehiculo constructor;

    public Vendedor(ConstructorDocumentacionVehiculo constructor) {
        this.constructor = constructor;
    }

    public Documentacion construye(String nombreCliente) {
        this.constructor.construyeSolicitudPedido(nombreCliente);
        this.constructor.construyeSolicitudMatriculacion(nombreCliente);
        return this.constructor.resultado();
    }
}
