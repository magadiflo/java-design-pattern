package app.creational.factory.alexandershvets.producto;

//Producto concreto
public class HTMLButton implements Button {

    @Override
    public void render() {
        System.out.println("<h1>Renderizando HTMLButton</h1>");
    }

    @Override
    public void onClick() {
        System.out.println("onClick() en el HTMLButton");
    }
}
