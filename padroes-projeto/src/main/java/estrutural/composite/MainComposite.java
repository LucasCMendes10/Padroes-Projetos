package estrutural.composite;

import java.awt.*;

public class MainComposite {
    public static void main(String[] args) {
        EditorImagem editorImagem = new EditorImagem();

        editorImagem.carregarFormas(
                new Circulo(10, 10, 10, Color.BLUE),

                new FormaComposta(
                        new Circulo(110, 110, 50, Color.RED),
                        new Ponto(160, 160, Color.RED)
                ),

                new FormaComposta(
                        new Retangulo(250, 250, 100, 100, Color.GREEN),
                        new Ponto(240, 240, Color.GREEN),
                        new Ponto(240, 360, Color.GREEN),
                        new Ponto(360, 360, Color.GREEN),
                        new Ponto(360, 240, Color.GREEN)
                )
        );
    }
}
