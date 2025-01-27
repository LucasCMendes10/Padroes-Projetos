package estrutural.bridge;

public class MainBridge {
    public static void main(String[] args) {
        Tv tv = new Tv();
        ControleAvancado controle = new ControleAvancado(tv);

        tv.exibirStatus();

        controle.energia();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.mutar();
        controle.mutar();
        controle.abaixarVolume();
        controle.avancarCanal();

        tv.exibirStatus();
    }
}
