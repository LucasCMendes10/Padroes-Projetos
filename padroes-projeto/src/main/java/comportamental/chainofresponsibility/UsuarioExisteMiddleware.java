package comportamental.chainofresponsibility;

public class UsuarioExisteMiddleware extends Middleware {

    private Servidor servidor;

    public UsuarioExisteMiddleware(Servidor servidor) {
        this.servidor = servidor;
    }

    @Override
    public boolean checar(String email, String senha) {
        if (!servidor.temEmail(email)) {
            System.out.println("Esse e-mail não está registrado!");
            return false;
        }

        if (!servidor.senhaEhValida(email, senha)) {
            System.out.println("Senha errada!");
            return false;
        }

        return checarProximo(email, senha);
    }
}
