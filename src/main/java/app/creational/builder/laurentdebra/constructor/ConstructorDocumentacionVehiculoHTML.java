package app.creational.builder.laurentdebra.constructor;

import app.creational.builder.laurentdebra.producto.DocumentacionHTML;

public class ConstructorDocumentacionVehiculoHTML extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoHTML() {
        this.documentacion = new DocumentacionHTML();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento = "<html>Solicitud de pedido Cliente: " + nombreCliente + "</html>";
        this.documentacion.agregarDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento = "<html>Solicitud de matriculación solicitante: " + nombreSolicitante + " </html>";
        this.documentacion.agregarDocumento(documento);
    }
}
