package comportamental.observer.publicador;

import comportamental.observer.listener.EventoListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciadorEvento {
    Map<String, List<EventoListener>> listeners = new HashMap<>();

    public GerenciadorEvento(String... operacoes) {
        for (String operacao : operacoes) {
            this.listeners.put(operacao, new ArrayList<>());
        }
    }

    public void inscrever(String tipoEvento, EventoListener listener) {
        List<EventoListener> usuarios = this.buscarEventos(tipoEvento);
        usuarios.add(listener);
    }

    public void desinscrever(String tipoEvento, EventoListener listener) {
        List<EventoListener> usuarios = this.buscarEventos(tipoEvento);
        usuarios.remove(listener);
    }

    public void notificar(String tipoEvento, File arquivo) {
        List<EventoListener> usuarios = this.buscarEventos(tipoEvento);

        for (EventoListener listener : usuarios) {
            listener.update(tipoEvento, arquivo);
        }
    }

    private List<EventoListener> buscarEventos(String tipoEvento) {
        return this.listeners.get(tipoEvento);
    }
}
