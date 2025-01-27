package estrutural.proxy;

import estrutural.proxy.biblioteca.BibliotecaTercerizadaYouTubeImpl;

public class MainProxy {
    public static void main(String[] args) {
        YouTubeDownloader originalDownloader = new YouTubeDownloader(new BibliotecaTercerizadaYouTubeImpl());
        YouTubeDownloader proxyDownloader = new YouTubeDownloader(new CacheYouTubeProxy());

        long original = testar(originalDownloader);
        long proxy = testar(proxyDownloader);

        System.out.print("Tempo salvo pelo proxy: " + (original - proxy) + "ms");
    }

    private static long testar(YouTubeDownloader downloader) {
        long tempoInicial = System.currentTimeMillis();


        downloader.renderizarVideosPopulares();
        downloader.renderizarPaginaVideo("catzzzzzzzzz");
        downloader.renderizarVideosPopulares();
        downloader.renderizarPaginaVideo("dancesvideoo");

        downloader.renderizarPaginaVideo("catzzzzzzzzz");
        downloader.renderizarPaginaVideo("someothervid");

        long tempoEstimado = System.currentTimeMillis() - tempoInicial;
        System.out.print("Tempo decorrido: " + tempoEstimado + "ms\n");
        return tempoEstimado;
    }
}
