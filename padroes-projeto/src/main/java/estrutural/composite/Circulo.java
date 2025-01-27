package estrutural.composite;

import java.awt.*;

public class Circulo extends FormaBase {

    public Integer raio;

    public Circulo(int x, int y, Integer raio, Color cor) {
        super(x, y, cor);
        this.raio = raio;
    }

    @Override
    public Integer getLargura() {
        return raio * 2;
    }

    @Override
    public Integer getAltura() {
        return raio * 2;
    }

    @Override
    public void pintar(Graphics graficos) {
        super.pintar(graficos);
        graficos.drawOval(x, y, getLargura() - 1, getAltura() - 1);
    }
}
