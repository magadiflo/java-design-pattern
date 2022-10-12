package app.structural.facade.alexandershvets;

import app.structural.facade.alexandershvets.facade.VideoConversionFacade;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("amor-pirata.ogg", "mp4");

        //Algún otro código según lógica de negocio.......
    }
}
