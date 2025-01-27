package estrutural.decorator;

public abstract class DecoradorFonteDado implements FonteDado {

    private FonteDado involucro;

    public DecoradorFonteDado(FonteDado involucro) {
        this.involucro = involucro;
    }

    @Override
    public void escreverDado(String dado) {
        involucro.escreverDado(dado);
    }

    @Override
    public String lerDado() {
        return involucro.lerDado();
    }
}
