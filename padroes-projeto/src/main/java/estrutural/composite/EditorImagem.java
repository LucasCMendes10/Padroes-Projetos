package estrutural.composite;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditorImagem {

    private EditorTela tela;
    private FormaComposta formas = new FormaComposta();

    public EditorImagem() {
        tela = new EditorTela();
    }

    public void carregarFormas(Forma... formas) {
        this.formas.limpar();
        this.formas.adicionar(formas);
        tela.recarregar();
    }

    private class EditorTela extends Canvas {
        JFrame quadro;

        private static final int PREENCHIMENTO = 10;

        EditorTela() {
            criarQuadro();
            recarregar();

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    formas.deselecionar();
                    formas.selecionarFilhoNo(e.getX(), e.getY());
                    e.getComponent().repaint();
                }
            });
        }

        void criarQuadro() {
            this.quadro = new JFrame();
            this.quadro.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.quadro.setLocationRelativeTo(null);

            JPanel painel = new JPanel();
            Border preenchimento = BorderFactory.createEmptyBorder(PREENCHIMENTO, PREENCHIMENTO, PREENCHIMENTO,
                    PREENCHIMENTO);
            painel.setBorder(preenchimento);

            this.quadro.setContentPane(painel);
            this.quadro.add(this);
            this.quadro.setVisible(true);
            this.quadro.getContentPane().setBackground(Color.LIGHT_GRAY);
        }

        public Integer getLargura() {
            return formas.getX() + formas.getLargura() + PREENCHIMENTO;
        }

        public Integer getAltura() {
            return formas.getY() + formas.getAltura() + PREENCHIMENTO;
        }

        void recarregar() {
            this.setSize(getLargura(), getAltura());
            this.quadro.pack();
        }

        public void pintar(Graphics graficos) {
            formas.pintar(graficos);
        }
    }
}
