package estrutural.composite;

import java.awt.*;

public interface Forma {

    Integer getX();

    Integer getY();

    Integer getLargura();

    Integer getAltura();

    void movimentar(Integer x, Integer y);

    boolean estaDentroLimite(Integer x, Integer y);

    void selecionar();

    void deselecionar();

    boolean estaSelecionado();

    void pintar(Graphics graficos);
}
