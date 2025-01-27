package estrutural.flyweight;

import java.awt.*;

public class MainFlyweight {

    static int TAMANHO_TELA = 500;
    static int ARVORES_PARA_DESENHAR = 1_000_000;
    static int TIPOS_ARVORES = 2;

    public static void main(String[] args) {
        Floresta floresta = new Floresta();

        for (int i = 0; i < Math.floor(ARVORES_PARA_DESENHAR / TIPOS_ARVORES); i++) {
            floresta.plantarArvore(aleatorio(0, TAMANHO_TELA), aleatorio(0, TAMANHO_TELA), "Carvalho",
                    Color.GREEN, "Textura de carvalho");

            floresta.plantarArvore(aleatorio(0, TAMANHO_TELA), aleatorio(0, TAMANHO_TELA), "Eucalipto",
                    Color.ORANGE, "Textura de eucalipto");
        }

        floresta.setSize(TAMANHO_TELA, TAMANHO_TELA);
        floresta.setVisible(true);

        System.out.println(ARVORES_PARA_DESENHAR + " árvores para desenhar");
        System.out.println("-------------------------------------");
        System.out.println("Memória usada");
        System.out.println("Tamanho da árvore (8 bytes) * " + ARVORES_PARA_DESENHAR);
        System.out.println("+ tamanho do TiposArvores (~ 30 bytes) * " + TIPOS_ARVORES);
        System.out.println("-------------------------------------");
        System.out.println("Total: " + ((ARVORES_PARA_DESENHAR * 8 + TIPOS_ARVORES * 30) / 1024 / 1024)
        + "MB (em vez de " + ((ARVORES_PARA_DESENHAR * 38) / 1024 / 1024) + "MB)");
    }

    private static int aleatorio(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
