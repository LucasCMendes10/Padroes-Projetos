package estrutural.facade.biblioteca;

public class LeitorTaxaBit {

    public static ArquivoVideo ler(ArquivoVideo arquivo, Codec codec) {
        System.out.println("LeitorTaxaBit: lendo arquivo...");
        return arquivo;
    }

    public static ArquivoVideo converter(ArquivoVideo arquivo, Codec codec) {
        System.out.println("LeitorTaxaBit: escrevendo arquivo...");
        return arquivo;
    }
}
