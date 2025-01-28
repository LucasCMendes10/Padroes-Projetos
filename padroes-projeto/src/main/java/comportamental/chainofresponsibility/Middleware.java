package comportamental.chainofresponsibility;

import java.util.Objects;

public abstract class Middleware {

    private Middleware proximo;

    public static Middleware elo(Middleware primeiro, Middleware... corrente) {
        Middleware cabeca = primeiro;

        for (Middleware proximoNaCorrente : corrente) {
            cabeca.proximo = proximoNaCorrente;
            cabeca = proximoNaCorrente;
        }

        return primeiro;
    }

    public abstract boolean checar(String email, String senha);

    protected boolean checarProximo(String email, String senha) {
        if (Objects.isNull(this.proximo)) return true;
        return this.proximo.checar(email, senha);
    }
}
