package estrutural.facade.biblioteca;

public class ArquivoVideo {

    private String nome;
    private String tipoCodec;

    public ArquivoVideo(String nome) {
        this.nome = nome;
        this.tipoCodec = nome.substring(nome.indexOf(".") + 1);
    }

    public String getNome() {
        return nome;
    }

    public String getTipoCodec() {
        return tipoCodec;
    }
}
