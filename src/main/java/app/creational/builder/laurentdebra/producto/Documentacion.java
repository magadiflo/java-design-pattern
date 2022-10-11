package app.creational.builder.laurentdebra.producto;

import java.util.ArrayList;
import java.util.List;

public abstract class Documentacion {

    protected List<String> contenido = new ArrayList<>();

    public abstract void agregarDocumento(String documento);

    public abstract void imprime();

}
