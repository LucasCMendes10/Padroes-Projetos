package estrutural.flyweight;

import java.awt.*;

public class Arvore {

    private int x;
    private int y;
    private TipoArvore tipo;

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void desenhar(Graphics graficos) {
        this.tipo.desenhar(graficos, x, y);
    }
}
