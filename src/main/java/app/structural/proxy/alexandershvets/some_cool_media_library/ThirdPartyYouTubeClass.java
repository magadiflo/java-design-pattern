package app.structural.proxy.alexandershvets.some_cool_media_library;

import java.util.HashMap;
import java.util.UUID;

// Implementación de servicio remoto
public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public HashMap<String, Video> popularVideo() {
        this.connectToServer("http://www.youtube.com");
        return this.getRandomVideo();
    }

    @Override
    public Video getVideo(String videoId) {
        this.connectToServer(String.format("http://www.youtube.com/%s", videoId));
        return this.getSomeVideo(videoId);
    }

    //Métodos fakes para simular la actividad de la red.
    //Son tan lentos como la vida real.

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public void experienceNetworkLatency() {
        int randomLatency = this.random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.printf("Connecting to %s ...%n", server);
        this.experienceNetworkLatency();
        System.out.println("Connected!");
    }

    private HashMap<String, Video> getRandomVideo() {
        System.out.println("Downloading populars...");
        this.experienceNetworkLatency();

        HashMap<String, Video> map = new HashMap<>();
        map.put("cats", new Video("1111111111", "Cats.avi"));
        map.put("dog", new Video("2222222222", "Dog play with ball.mp4"));
        map.put("dancing", new Video("3333333333", "Dancing video.mpq"));
        map.put("football", new Video("4444444444", "Barcelona vs Real Madrid.mov"));
        map.put("programing", new Video("5555555555", "Programing lesson#1.avi"));

        System.out.println("Done!");
        return map;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Downloading video...");
        this.experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");
        System.out.println("Done!");
        return video;
    }

}
