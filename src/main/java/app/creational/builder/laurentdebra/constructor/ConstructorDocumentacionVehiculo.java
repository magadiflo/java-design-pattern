package app.creational.builder.laurentdebra.constructor;

import app.creational.builder.laurentdebra.producto.Documentacion;

public abstract class ConstructorDocumentacionVehiculo {

    protected Documentacion documentacion;

    public abstract void construyeSolicitudPedido(String nombreCliente);

    public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);

    public Documentacion resultado() {
        return this.documentacion;
    }

}
