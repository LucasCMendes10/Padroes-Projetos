package estrutural.decorator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class DecoradorCompressao extends DecoradorFonteDado {

    private int nivelComp = 6;

    public DecoradorCompressao(FonteDado involucro) {
        super(involucro);
    }

    public int getNivelCompressao() {
        return this.nivelComp;
    }

    public void setNivelCompressao(int nivelComp) {
        this.nivelComp = nivelComp;
    }

    @Override
    public void escreverDado(String dado) {
        super.escreverDado(comprimir(dado));
    }

    @Override
    public String lerDado() {
        return descomprimir(super.lerDado());
    }

    private String comprimir(String dadoString) {
        byte[] dado = dadoString.getBytes();

        try {
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            DeflaterOutputStream dos = new DeflaterOutputStream(bout, new Deflater(this.nivelComp));

            dos.write(dado);

            dos.close();
            bout.close();

            return Base64.getEncoder().encodeToString(bout.toByteArray());
        } catch (IOException e) {
            return null;
        }
    }

    private String descomprimir(String dadoString) {
        byte[] dado = Base64.getDecoder().decode(dadoString);

        try {
            InputStream in = new ByteArrayInputStream(dado);
            InflaterInputStream iin = new InflaterInputStream(in);
            ByteArrayOutputStream bout = new ByteArrayOutputStream(512);
            int b;

            while ((b = iin.read()) != -1) {
                bout.write(b);
            }

            in.close();
            iin.close();
            bout.close();

            return bout.toString();
        } catch (IOException e) {
            return null;
        }
    }
}
