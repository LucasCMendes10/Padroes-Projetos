package estrutural.facade.biblioteca;

import java.io.File;

public class MixadorAudio {

    public File consertar(ArquivoVideo resultado) {
        System.out.println("MixadorAudio: consertando áudio...");
        return new File("tmp");
    }
}
