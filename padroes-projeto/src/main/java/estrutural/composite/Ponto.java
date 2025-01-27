package estrutural.composite;

import java.awt.*;

public class Ponto extends FormaBase {

    private final int TAMANHO_PONTO = 3;

    public Ponto(int x, int y, Color cor) {
        super(x, y, cor);
    }

    @Override
    public Integer getLargura() {
        return this.TAMANHO_PONTO;
    }

    @Override
    public Integer getAltura() {
        return this.TAMANHO_PONTO;
    }

    @Override
    public void pintar(Graphics graficos) {
        super.pintar(graficos);
        graficos.fillRect(x - 1, y - 1, getLargura(), getAltura());
    }
}
