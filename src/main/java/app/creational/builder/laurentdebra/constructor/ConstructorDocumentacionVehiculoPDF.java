package app.creational.builder.laurentdebra.constructor;

import app.creational.builder.laurentdebra.producto.DocumentacionPDF;

public class ConstructorDocumentacionVehiculoPDF extends ConstructorDocumentacionVehiculo {

    public ConstructorDocumentacionVehiculoPDF() {
        this.documentacion = new DocumentacionPDF();
    }

    @Override
    public void construyeSolicitudPedido(String nombreCliente) {
        String documento = "<pdf>Solicitud de pedido cliente: " + nombreCliente + "</pdf>";
        this.documentacion.agregarDocumento(documento);
    }

    @Override
    public void construyeSolicitudMatriculacion(String nombreSolicitante) {
        String documento = "<pdf>Solicitud de matriculación solicitante: " + nombreSolicitante + "</pdf>";
        this.documentacion.agregarDocumento(documento);
    }
}
