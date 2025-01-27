package estrutural.facade;

import estrutural.facade.biblioteca.*;

import java.io.File;

public class ConversaoVideoFacade {

    public File converterVideo(String nomeArquivo, String formato) {
        System.out.println("ConversaoVideoFacade: conversão iniciada.");

        ArquivoVideo arquivo = new ArquivoVideo(nomeArquivo);
        Codec fonteCodec = CodecFactory.extrair(arquivo);
        Codec codecDestino;

        if (formato.equals("mp4")) {
            codecDestino = new MPEG4CompressaoCodec();
        } else {
            codecDestino = new OggCompressaoCodec();
        }

        ArquivoVideo buffer = LeitorTaxaBit.ler(arquivo, fonteCodec);
        ArquivoVideo resultadoIntermediario = LeitorTaxaBit.converter(buffer, codecDestino);

        File resultado = (new MixadorAudio()).consertar(resultadoIntermediario);

        System.out.println("converterVideo: conversão completada.");

        return resultado;
    }
}
