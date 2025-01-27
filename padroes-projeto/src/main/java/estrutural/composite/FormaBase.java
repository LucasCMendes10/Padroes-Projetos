package estrutural.composite;

import java.awt.*;

public class FormaBase implements Forma {

    public int x;
    public int y;
    public Color cor;
    private boolean selecionado = false;

    public FormaBase(int x, int y, Color cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    @Override
    public Integer getX() {
        return this.x;
    }

    @Override
    public Integer getY() {
        return this.y;
    }

    @Override
    public Integer getLargura() {
        return 0;
    }

    @Override
    public Integer getAltura() {
        return 0;
    }

    @Override
    public void movimentar(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean estaDentroLimite(Integer x, Integer y) {
        return x > getX() && x < (getX() + getLargura()) &&
                y > getY() && y < (getY() + getAltura());
    }

    @Override
    public void selecionar() {
        this.selecionado = true;
    }

    @Override
    public void deselecionar() {
        this.selecionado = false;
    }

    @Override
    public boolean estaSelecionado() {
        return this.selecionado;
    }

    void ativarSelecaoEstilo(Graphics graficos) {
        graficos.setColor(Color.LIGHT_GRAY);

        Graphics2D g2 = (Graphics2D) graficos;

        float[] dash1 = {2.0f};

        g2.setStroke(new BasicStroke(1.0f,
                BasicStroke.CAP_BUTT,
                BasicStroke.JOIN_MITER,
                2.0f,
                dash1,
                0.0f));
    }

    void desativarSelecaoEstilo(Graphics graficos) {
        graficos.setColor(this.cor);
        Graphics2D g2 = (Graphics2D) graficos;
        g2.setStroke(new BasicStroke());
    }

    @Override
    public void pintar(Graphics graficos) {
        if (estaSelecionado()) {
            ativarSelecaoEstilo(graficos);
        } else {
            desativarSelecaoEstilo(graficos);
        }
    }
}
