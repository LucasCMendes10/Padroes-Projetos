package estrutural.proxy;

import estrutural.proxy.biblioteca.BibliotecaTercerizadaYouTube;
import estrutural.proxy.biblioteca.Video;

import java.util.HashMap;

public class YouTubeDownloader {

    private BibliotecaTercerizadaYouTube api;

    public YouTubeDownloader(BibliotecaTercerizadaYouTube api) {
        this.api = api;
    }

    public void renderizarPaginaVideo(String videoId) {
        Video video = api.getVideo(videoId);

        System.out.println("\n---------------------------");
        System.out.println("Página do vídeo (imagine um front bonito)");
        System.out.println("ID: " + video.id);
        System.out.println("Título: " + video.titulo);
        System.out.println("Vídeo: " + video.dado);
        System.out.println("---------------------------\n");
    }

    public void renderizarVideosPopulares() {
        HashMap<String, Video> lista = api.videosPopulares();
        System.out.println("\n---------------------------");
        System.out.println("Vídeos mais populares do YouTube (imagine um front bonito)");

        for (Video video : lista.values()) {
            System.out.println("ID: "+ video.id + " / Título: " + video.titulo);
        }

        System.out.println("---------------------------\n");
    }
}
