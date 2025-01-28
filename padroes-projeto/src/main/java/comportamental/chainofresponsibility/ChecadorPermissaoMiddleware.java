package comportamental.chainofresponsibility;

public class ChecadorPermissaoMiddleware extends Middleware {

    @Override
    public boolean checar(String email, String senha) {
        if (email.equals("admin@example.com")) {
            System.out.println("Olá, admin!");
            return true;
        }

        System.out.println("Olá, usuário!");
        return checarProximo(email, senha);
    }
}
