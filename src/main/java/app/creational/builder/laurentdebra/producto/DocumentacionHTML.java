package app.creational.builder.laurentdebra.producto;

public class DocumentacionHTML extends Documentacion {

    @Override
    public void agregarDocumento(String documento) {
        if (documento.startsWith("<html>")) {
            this.contenido.add(documento);
        }
    }

    @Override
    public void imprime() {
        System.out.println("Documentación HTML");
        this.contenido.forEach(System.out::println);
    }
}
