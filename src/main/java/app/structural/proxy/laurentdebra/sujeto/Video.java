package app.structural.proxy.laurentdebra.sujeto;

//Sujeto real
public class Video implements Animacion {

    @Override
    public void dibuja() {
        System.out.println("(dibuja) Mostrar el video...");
    }

    @Override
    public void click() {

    }

    public void carga() {
        System.out.println("Cargando video...");
    }

    public void reproduce() {
        System.out.println("Reproduciendo el video...");
    }

}
