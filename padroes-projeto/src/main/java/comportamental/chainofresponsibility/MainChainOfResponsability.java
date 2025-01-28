package comportamental.chainofresponsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainChainOfResponsability {
    private static BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
    private static Servidor servidor;

    public static void main(String[] args) throws IOException {
        servidor = new Servidor();
        servidor.registrar("admin@example.com", "admin_pass");
        servidor.registrar("user@example.com", "user_pass");

        Middleware middleware = Middleware.elo(
                new ThrottlingMiddleware(2),
                new UsuarioExisteMiddleware(servidor),
                new ChecadorPermissaoMiddleware()
        );

        servidor.setMiddleware(middleware);

        boolean sucesso;

        do {
            System.out.println("E-mail: ");
            String email = leitor.readLine();

            System.out.println("Senha: ");
            String senha = leitor.readLine();

            sucesso = servidor.login(email, senha);
        } while (!sucesso);
    }
}
