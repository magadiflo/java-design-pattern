package app.structural.proxy.alexandershvets;

import app.structural.proxy.alexandershvets.downloader.YouTubeDownloader;
import app.structural.proxy.alexandershvets.proxy.YouTubeCacheProxy;
import app.structural.proxy.alexandershvets.some_cool_media_library.ThirdPartyYouTubeClass;

public class Main {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.printf("Tiempo ahorrado por el proxy de almacenamiento en caché : %d ms", (naive - smart));
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        //Comportamiento del usuario en nuestra aplicación
        downloader.renderPopularVideos();
        downloader.renderVideoPage("1111111111");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("3333333333");

        //Los usuarios pueden visitar la misma página con mucha frecuencia
        downloader.renderVideoPage("1111111111");
        downloader.renderVideoPage("5555555555");


        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.printf("Tiempo transcurrido: %d ms %n", estimatedTime);
        return estimatedTime;
    }

}
