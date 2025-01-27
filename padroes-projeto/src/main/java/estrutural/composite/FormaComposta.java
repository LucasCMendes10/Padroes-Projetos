package estrutural.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FormaComposta extends FormaBase {

    protected List<Forma> filhos = new ArrayList<>();

    public FormaComposta(Forma... componentes) {
        super(0, 0, Color.BLACK);
        adicionar(componentes);
    }

    public void adicionar(Forma componente) {
        filhos.add(componente);
    }

    public void adicionar(Forma... componentes) {
        filhos.addAll(Arrays.asList(componentes));
    }

    public void remover(Forma componente) {
        filhos.remove(componente);
    }

    public void remover(Forma... componentes) {
        filhos.removeAll(Arrays.asList(componentes));
    }

    public void limpar() {
        filhos.clear();
    }

    @Override
    public Integer getX() {
        if (filhos.isEmpty()) return 0;

        int x = filhos.get(0).getX();

        for (Forma filho : filhos) {
            if (filho.getX() < x) {
                x = filho.getX();
            }
        }

        return x;
    }

    @Override
    public Integer getY() {
        if (filhos.isEmpty()) return 0;

        int y = filhos.get(0).getY();

        for (Forma filho : filhos) {
            if (filho.getY() < y) {
                y = filho.getY();
            }
        }

        return y;
    }

    @Override
    public Integer getLargura() {
        int larguraMaxima = 0;
        int x = getX();

        for (Forma filho : filhos) {
            int xRelativoFilho = filho.getX() - x;
            int larguraFilho = xRelativoFilho + filho.getLargura();

            if (larguraFilho > larguraMaxima) {
                larguraMaxima = larguraFilho;
            }
        }

        return larguraMaxima;
    }

    @Override
    public Integer getAltura() {
        int alturaMaxima = 0;
        int y = getY();

        for (Forma filho : filhos) {
            int yRelativoFilho = filho.getY() - y;
            int alturaFilho = yRelativoFilho + filho.getAltura();

            if (alturaFilho > alturaMaxima) {
                alturaMaxima = alturaFilho;
            }
        }

        return alturaMaxima;
    }

    @Override
    public void movimentar(Integer x, Integer y) {
        for (Forma filho : filhos) {
            filho.movimentar(x, y);
        }
    }

    @Override
    public boolean estaDentroLimite(Integer x, Integer y) {
        for (Forma filho : filhos) {
            if (filho.estaDentroLimite(x, y)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public void deselecionar() {
        super.deselecionar();

        for (Forma filho : filhos) {
            filho.deselecionar();
        }
    }

    public boolean selecionarFilhoNo(int x, int y) {
        for (Forma filho : filhos) {
            if (filho.estaDentroLimite(x, y)) {
                filho.selecionar();
                return true;
            }
        }

        return false;
    }

    @Override
    public void pintar(Graphics graficos) {
        if (estaSelecionado()) {
            ativarSelecaoEstilo(graficos);
            graficos.drawRect(getX() - 1 , getY() - 1, getLargura() + 1, getAltura() + 1);
            desativarSelecaoEstilo(graficos);
        }

        for (Forma filho : filhos) {
            filho.pintar(graficos);
        }
    }
}
