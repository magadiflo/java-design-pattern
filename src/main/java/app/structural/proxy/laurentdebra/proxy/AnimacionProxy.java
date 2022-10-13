package app.structural.proxy.laurentdebra.proxy;

import app.structural.proxy.laurentdebra.sujeto.Animacion;
import app.structural.proxy.laurentdebra.sujeto.Video;

//Proxy
public class AnimacionProxy implements Animacion {

    protected Video video = null;
    protected String foto = "mostrar foto";

    @Override
    public void dibuja() {
        if (this.video != null) {
            this.video.dibuja();
        }
        this.dibuja(this.foto);
    }

    @Override
    public void click() {
        if (this.video == null) {
            this.video = new Video();
            this.video.carga();
        }
        this.video.reproduce();

    }

    public void dibuja(String foto) {
        System.out.println(foto);
    }

}
