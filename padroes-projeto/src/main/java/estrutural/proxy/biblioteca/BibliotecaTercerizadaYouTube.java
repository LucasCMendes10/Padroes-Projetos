package estrutural.proxy.biblioteca;

import java.util.HashMap;

public interface BibliotecaTercerizadaYouTube {

    HashMap<String, Video> videosPopulares();

    Video getVideo(String videoId);
}
