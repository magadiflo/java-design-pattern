package app.structural.proxy.javatechonline.service;

public class Folder implements  IFolder{

    @Override
    public void performOperations() {
        //Acceder a la carpeta y realizar varias operaciones como copiar o cortar archivos
        System.out.println("Performing operation on folder");
    }

}
