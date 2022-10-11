package app.creational.builder.laurentdebra.producto;

public class DocumentacionPDF extends Documentacion {
    @Override
    public void agregarDocumento(String documento) {
        if (documento.startsWith("<pdf>")) {
            this.contenido.add(documento);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Documentación PDF");
        this.contenido.forEach(System.out::println);
    }
}
