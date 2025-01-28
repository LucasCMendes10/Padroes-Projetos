package comportamental.chainofresponsibility;

public class ThrottlingMiddleware extends Middleware {

    private int requisicaoPorMinuto;
    private int requisicao;
    private long tempoAtual;

    public ThrottlingMiddleware(int requisicaoPorMinuto) {
        this.requisicaoPorMinuto = requisicaoPorMinuto;
        this.tempoAtual = System.currentTimeMillis();
    }

    @Override
    public boolean checar(String email, String senha) {
        if (System.currentTimeMillis() > this.tempoAtual + 60_000) {
            this.requisicao = 0;
            this.tempoAtual = System.currentTimeMillis();
        }

        this.requisicao++;

        if (this.requisicao > this.requisicaoPorMinuto) {
            System.out.println("Requisição excedeu o limite!");
            Thread.currentThread().stop();
        }

        return checarProximo(email, senha);
    }
}
