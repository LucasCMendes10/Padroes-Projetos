package estrutural.proxy;

import estrutural.proxy.biblioteca.BibliotecaTercerizadaYouTube;
import estrutural.proxy.biblioteca.BibliotecaTercerizadaYouTubeImpl;
import estrutural.proxy.biblioteca.Video;

import java.util.HashMap;
import java.util.Objects;

public class CacheYouTubeProxy implements BibliotecaTercerizadaYouTube {

    private BibliotecaTercerizadaYouTube youtubeService;
    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheTodos = new HashMap<String, Video>();

    public CacheYouTubeProxy() {
        this.youtubeService = new BibliotecaTercerizadaYouTubeImpl();
    }

    @Override
    public HashMap<String, Video> videosPopulares() {
        if (this.cachePopular.isEmpty()) {
            this.cachePopular = youtubeService.videosPopulares();
        } else {
            System.out.println("Lista de cache recuperada");
        }

        return this.cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video =  cacheTodos.get(videoId);

        if (Objects.isNull(video)) {
            video = youtubeService.getVideo(videoId);
            cacheTodos.put(videoId, video);
        } else {
            System.out.println("Vídeo " + videoId + " recuperado do cache");
        }

        return video;
    }

    public void resetar() {
        this.cachePopular.clear();
        this.cacheTodos.clear();
    }
}
