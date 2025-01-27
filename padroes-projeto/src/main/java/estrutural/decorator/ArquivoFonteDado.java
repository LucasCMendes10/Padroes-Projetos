package estrutural.decorator;

import java.io.*;

public class ArquivoFonteDado implements FonteDado {

    private String nome;

    public ArquivoFonteDado(String nome) {
        this.nome = nome;
    }

    @Override
    public void escreverDado(String dado) {
        File arquivo = new File(this.nome);

        try (OutputStream escritor = new FileOutputStream(arquivo)) {
            escritor.write(dado.getBytes(), 0, dado.length());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String lerDado() {
        char[] buffer = new char[0];
        File arquivo = new File(this.nome);

        try (FileReader leitor = new FileReader(arquivo)) {
            buffer = new char[(int) arquivo.length()];
            leitor.read(buffer);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return new String(buffer);
    }
}
