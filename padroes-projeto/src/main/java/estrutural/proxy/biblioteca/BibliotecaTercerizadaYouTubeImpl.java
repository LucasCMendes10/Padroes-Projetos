package estrutural.proxy.biblioteca;

import java.util.HashMap;

public class BibliotecaTercerizadaYouTubeImpl implements BibliotecaTercerizadaYouTube {

    @Override
    public HashMap<String, Video> videosPopulares() {
        conectarNoServidor("http://www.youtube.com");
        return getVideosAleatorios();
    }

    @Override
    public Video getVideo(String videoId) {
        conectarNoServidor("http://www.youtube.com/" + videoId);
        return getAlgumVideo(videoId);
    }

    // Método para simular uma conexão com o YouTube de verdade

    private int aleatorio(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experimentarLatenciaConexao() {
        int latenciaAleatoria = aleatorio(5, 10);

        for (int i = 0; i < latenciaAleatoria; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
        }
    }

    private void conectarNoServidor(String servidor) {
        System.out.println("Conectando no " + servidor + "...");
        experimentarLatenciaConexao();
        System.out.println("Conectado!\n");
    }

    private HashMap<String, Video> getVideosAleatorios() {
        System.out.println("Downloading populares...");

        experimentarLatenciaConexao();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));
        hmap.put("dancesvideoo", new Video("asdfas3ffasd", "Dancing video.mpq"));
        hmap.put("dlsdk5jfslaf", new Video("dlsdk5jfslaf", "Barcelona vs RealM.mov"));
        hmap.put("3sdfgsd1j333", new Video("3sdfgsd1j333", "Programing lesson#1.avi"));

        System.out.println("Feito!\n");

        return hmap;
    }

    private Video getAlgumVideo(String videoId) {
        System.out.println("Downloading vídeo...");

        experimentarLatenciaConexao();
        Video video = new Video(videoId, "Algum título pequeno");

        System.out.println("Feito!\n");

        return video;
    }
}
