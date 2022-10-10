package app.creational.factory.alexandershvets.producto;

//Producto concreto
public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("JOptionPane.showMessageDialog('Renderizando WindowsButton')");
    }

    @Override
    public void onClick() {
        System.out.println("onClick() en el WindowsButton");
    }
}
