package app.structural.proxy.alexandershvets.proxy;

import app.structural.proxy.alexandershvets.some_cool_media_library.ThirdPartyYouTubeClass;
import app.structural.proxy.alexandershvets.some_cool_media_library.ThirdPartyYouTubeLib;
import app.structural.proxy.alexandershvets.some_cool_media_library.Video;

import java.util.HashMap;

//Proxy de caché
public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheAll = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideo() {
        if (this.cachePopular.isEmpty()) {
            this.cachePopular = this.youtubeService.popularVideo();
        } else {
            System.out.println("Lista recuperada del caché");
        }
        return this.cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = this.cacheAll.get(videoId);
        if(video == null){
            video = this.youtubeService.getVideo(videoId);
            this.cacheAll.put(videoId, video);
        } else {
            System.out.printf("Video %s recuperado de la caché %n", videoId);
        }
        return video;
    }

    //Eliminamos todos los elementos o asignaciones de ambos hashMap
    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }

}
