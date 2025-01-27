package estrutural.composite;

import java.awt.*;

public class Retangulo extends FormaBase {

    public Integer largura;
    public Integer altura;

    public Retangulo(int x, int y, Integer largura, Integer altura, Color cor) {
        super(x, y, cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public Integer getLargura() {
        return this.largura;
    }

    @Override
    public Integer getAltura() {
        return this.altura;
    }

    @Override
    public void pintar(Graphics graficos) {
        super.pintar(graficos);
        graficos.drawRect(x, y, getLargura() - 1, getAltura() - 1);
    }
}
