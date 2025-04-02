package comportamental.observer.listener;

import java.io.File;

public class AbrirLogListener implements EventoListener {

    private File log;

    public AbrirLogListener(String nomeArquivo) {
        this.log = new File(nomeArquivo);
    }

    @Override
    public void update(String tipoEvento, File arquivo) {
        System.out.printf("Salvando log: %s: 'Alguém realizou a operação %s com o seguinte arquivo: %s'\n",
                this.log, tipoEvento, arquivo.getName());
    }
}
