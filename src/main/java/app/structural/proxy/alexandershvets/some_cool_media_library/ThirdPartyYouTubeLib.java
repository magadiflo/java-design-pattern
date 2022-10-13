package app.structural.proxy.alexandershvets.some_cool_media_library;

import java.util.HashMap;

//Interfaz del servicio remoto
public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideo();

    Video getVideo(String videoId);

}
