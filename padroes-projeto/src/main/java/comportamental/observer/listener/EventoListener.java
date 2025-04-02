package comportamental.observer.listener;

import java.io.File;

public interface EventoListener {
    void update(String tipoEvento, File arquivo);
}
