package estrutural.bridge;

public class ControleAvancado extends ControleBasico {

    private Integer volumeAnterior;

    public ControleAvancado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    public void mutar() {
        if (dispositivo.getVolume() > 0) {
            System.out.println("Controle: mutando volume");
            this.volumeAnterior = dispositivo.getVolume();
            dispositivo.setVolume(0);
            System.out.println("Volume atual: " + dispositivo.getVolume() + "%");
        } else {
            System.out.println("Controle: desmutando volume");
            dispositivo.setVolume(this.volumeAnterior);
            System.out.println("Volume atual: " + dispositivo.getVolume() + "%");
        }
    }
}
