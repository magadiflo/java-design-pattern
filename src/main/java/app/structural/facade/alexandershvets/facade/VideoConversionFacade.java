package app.structural.facade.alexandershvets.facade;

import app.structural.facade.alexandershvets.some_complex_media_library.*;

import java.io.File;

/**
 * En este ejemplo, esta clase (VideoConversionFacade) es la que hace de FACADE,
 * pues simplifica la comunicación con un framework complejo de conversión de video
 * (Recordar que simulamos ese framework o librería de conversión de video
 * en el package /some_complex_media_library)
 *
 * Identificación:
 * El patrón Facade se puede reconocer en una clase con una interfaz simple, pero que delega
 * la mayor parte del trabajo a otras clases. Normalmente, las fachadas gestionan
 * todo el ciclo de vida de los objetos que utilizan.
 */
public class VideoConversionFacade {

    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started...");
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;

        if (format.equals("mp4")) {
            destinationCodec = new MPEGCompressionCodec();
        } else {
            destinationCodec = new OggCompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("VideoConversionFacade: conversion completed!");

        return result;
    }

}
