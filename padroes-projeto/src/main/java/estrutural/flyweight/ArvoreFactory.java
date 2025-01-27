package estrutural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ArvoreFactory {

    static Map<String, TipoArvore> tiposArvores = new HashMap<>();

    public static TipoArvore getTipoArvore(String nome, Color cor, String outroDadoArvore) {
        TipoArvore resultado = tiposArvores.get(nome);

        if (Objects.isNull(resultado)) {
            resultado = new TipoArvore(nome, cor, outroDadoArvore);
            tiposArvores.put(nome, resultado);
        }

        return resultado;
    }
}
