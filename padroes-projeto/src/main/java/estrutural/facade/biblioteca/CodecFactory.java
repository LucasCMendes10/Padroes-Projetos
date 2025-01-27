package estrutural.facade.biblioteca;

public class CodecFactory {
    public static Codec extrair(ArquivoVideo arquivo) {
        String tipo = arquivo.getTipoCodec();

        if (tipo.equals("mp4")) {
            System.out.println("CodecFactory: extraindo áudio mpeg...");
            return new MPEG4CompressaoCodec();
        } else {
            System.out.println("CodecFactory: extraindo áudio ogg...");
            return new OggCompressaoCodec();
        }
    }
}
