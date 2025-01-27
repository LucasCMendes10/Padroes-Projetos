package estrutural.flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Floresta extends JFrame {

    private List<Arvore> arvores = new ArrayList<>();

    public void plantarArvore(int x, int y, String nome, Color cor, String outroDadoArvore) {
        TipoArvore tipo = ArvoreFactory.getTipoArvore(nome, cor, outroDadoArvore);
        Arvore arvore = new Arvore(x, y, tipo);
        arvores.add(arvore);
    }

    @Override
    public void paint(Graphics g) {
        for (Arvore arvore : arvores) {
            arvore.desenhar(g);
        }
    }
}
