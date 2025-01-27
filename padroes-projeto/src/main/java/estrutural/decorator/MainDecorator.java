package estrutural.decorator;

public class MainDecorator {
    public static void main(String[] args) {
        String local = "src/main/java/estrutural/decorator/SaidaDemo.txt";
        String registrosSalario = "Nome,Salario\nJack Kirby,100000\nWally Wood,912000";

        DecoradorFonteDado codificado = new DecoradorCompressao(
                new DecoradorCriptografia(new ArquivoFonteDado(local))
        );
        codificado.escreverDado(registrosSalario);

        FonteDado fonte = new ArquivoFonteDado(local);

        System.out.println("- Entrada ----------------");
        System.out.println(registrosSalario);
        System.out.println("- Codificado -------------");
        System.out.println(fonte.lerDado());
        System.out.println("- Decodificado -----------");
        System.out.println(codificado.lerDado());
    }
}
