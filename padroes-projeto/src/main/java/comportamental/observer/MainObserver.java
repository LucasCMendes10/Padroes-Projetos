package comportamental.observer;

import comportamental.observer.editor.Editor;
import comportamental.observer.listener.AbrirLogListener;
import comportamental.observer.listener.NofiticacaoEmailListener;

public class MainObserver {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.eventos.inscrever("abrir", new AbrirLogListener("arquivo.txt"));
        editor.eventos.inscrever("salvar", new NofiticacaoEmailListener("admin@exemplo.com"));

        try {
            editor.abriArquivo("teste.txt");
            editor.salvarArquivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
