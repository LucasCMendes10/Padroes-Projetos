package estrutural.bridge;

public class ControleBasico implements Controle {

    protected Dispositivo dispositivo;

    public ControleBasico() {
    }

    public ControleBasico(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void energia() {
        System.out.println("Controle: alternância de energia");

        if (dispositivo.ehAtivo()) {
            dispositivo.desativar();
            System.out.println("Dispositivo desligado");
        } else {
            dispositivo.ativar();
            System.out.println("Dispositivo ligado");
        }
    }

    @Override
    public void abaixarVolume() {
        System.out.println("Controle: abaixando volume");
        dispositivo.setVolume(dispositivo.getVolume() - 10);
        System.out.println("Volume atual: " + dispositivo.getVolume() + "%");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Controle: aumentando volume");
        dispositivo.setVolume(dispositivo.getVolume() + 10);
        System.out.println("Volume atual: " + dispositivo.getVolume() + "%");
    }

    @Override
    public void voltarCanal() {
        System.out.println("Controle: voltando canal");
        dispositivo.setCanal(dispositivo.getCanal() - 1);
        System.out.println("Canal atual: " + dispositivo.getCanal());
    }

    @Override
    public void avancarCanal() {
        System.out.println("Controle: avançando canal");
        dispositivo.setCanal(dispositivo.getCanal() + 1);
        System.out.println("Canal atual: " + dispositivo.getCanal());
    }
}
