package estrutural.decorator;

import java.util.Base64;

public class DecoradorCriptografia extends DecoradorFonteDado {

    public DecoradorCriptografia(FonteDado involucro) {
        super(involucro);
    }

    @Override
    public void escreverDado(String dado) {
        super.escreverDado(codificar(dado));
    }

    @Override
    public String lerDado() {
        return decodificar(super.lerDado());
    }

    private String codificar(String dado) {
        byte[] resultado = dado.getBytes();

        for (byte b : resultado) {
            b += (byte) 1;
        }

        return Base64.getEncoder().encodeToString(resultado);
    }

    private String decodificar(String dado) {
        byte[] resultado = Base64.getDecoder().decode(dado);

        for (byte b : resultado) {
            b -= (byte) 1;
        }

        return new String(resultado);
    }
}
