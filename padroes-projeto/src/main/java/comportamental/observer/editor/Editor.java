package comportamental.observer.editor;

import comportamental.observer.publicador.GerenciadorEvento;

import java.io.File;
import java.util.Objects;

public class Editor {
    public GerenciadorEvento eventos;
    private File arquivo;

    public Editor() {
        this.eventos = new GerenciadorEvento("abrir", "salvar");
    }

    public void abriArquivo(String caminhoArquivo) {
        this.arquivo = new File(caminhoArquivo);
        eventos.notificar("abrir", this.arquivo);
    }

    public void salvarArquivo() throws Exception {
        if (Objects.nonNull(this.arquivo)) {
            eventos.notificar("salvar", this.arquivo);
        } else {
            throw new Exception("Por favor abra o arquivo primeiro");
        }
    }
}
