package app.structural.proxy.alexandershvets.downloader;

import app.structural.proxy.alexandershvets.some_cool_media_library.ThirdPartyYouTubeLib;
import app.structural.proxy.alexandershvets.some_cool_media_library.Video;

import java.util.HashMap;

public class YouTubeDownloader {

    private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = this.api.getVideo(videoId);
        System.out.println("\n-----------------------------------------");
        System.out.println("Videos más populares en youtube (imagina un HTML elegante)");
        System.out.printf("ID: %s%n", video.id);
        System.out.printf("Title: %s%n", video.title);
        System.out.printf("Video: %s%n", video.data);
        System.out.println("-----------------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = this.api.popularVideo();
        System.out.println("\n-----------------------------------------");
        System.out.println("Videos más populares en youtube (imagina un HTML elegante)");
        for (Video v : list.values()) {
            System.out.printf("Id: %s / Title: %s %n", v.id, v.title);
        }
        System.out.println("------------------------------------------\n");

    }
}
