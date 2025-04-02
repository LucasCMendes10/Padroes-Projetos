package comportamental.observer.listener;

import java.io.File;

public class NofiticacaoEmailListener implements EventoListener {

    private String email;

    public NofiticacaoEmailListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String tipoEvento, File arquivo) {
        System.out.printf("E-mail para %s: 'Alguém realizou a operação %s com o seguinte arquivo: %s'\n",
                this.email, tipoEvento, arquivo.getName());
    }
}
