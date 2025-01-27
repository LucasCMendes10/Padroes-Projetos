package estrutural.flyweight;

import java.awt.*;

public class TipoArvore {

    private String nome;
    private Color cor;
    private String outroDadoArvore;

    public TipoArvore(String nome, Color cor, String outroDadoArvore) {
        this.nome = nome;
        this.cor = cor;
        this.outroDadoArvore = outroDadoArvore;
    }

    public void desenhar(Graphics graficos, int x, int y) {
        graficos.setColor(Color.BLACK);
        graficos.fillRect(x - 1, y, 3, 5);
        graficos.setColor(this.cor);
        graficos.fillOval(x - 5, y - 10, 10, 10);
    }
}
