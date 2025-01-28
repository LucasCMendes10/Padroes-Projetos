package comportamental.chainofresponsibility;

import java.util.HashMap;

public class Servidor {

    private HashMap<String, String> usuarios = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    public boolean login(String email, String senha) {
        if (middleware.checar(email, senha)) {
            System.out.println("Autenticação foi um sucesso!");
            return true;
        }

        return false;
    }

    public void registrar(String email, String senha) {
        usuarios.put(email, senha);
    }

    public boolean temEmail(String email) {
        return usuarios.containsKey(email);
    }

    public boolean senhaEhValida(String email, String senha) {
        return usuarios.get(email).equals(senha);
    }
}
