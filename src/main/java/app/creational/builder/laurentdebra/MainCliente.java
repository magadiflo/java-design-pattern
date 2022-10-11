package app.creational.builder.laurentdebra;

import app.creational.builder.laurentdebra.constructor.ConstructorDocumentacionVehiculo;
import app.creational.builder.laurentdebra.constructor.ConstructorDocumentacionVehiculoHTML;
import app.creational.builder.laurentdebra.constructor.ConstructorDocumentacionVehiculoPDF;
import app.creational.builder.laurentdebra.director.Vendedor;
import app.creational.builder.laurentdebra.producto.Documentacion;

import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConstructorDocumentacionVehiculo constructor;
        System.out.print("Desea generar [documentación HTML(1)] o [PDF(2)]: ");
        String seleccion = sc.next();
        if(seleccion.equals("1")) {
            constructor = new ConstructorDocumentacionVehiculoHTML();
        } else {
            constructor = new ConstructorDocumentacionVehiculoPDF();
        }
        Vendedor vendedor = new Vendedor(constructor);
        Documentacion documentacion = vendedor.construye("Martín");
        documentacion.imprime();
    }
}
