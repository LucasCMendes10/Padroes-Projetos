package estrutural.bridge;

public class Tv implements Dispositivo {

    private boolean on = false;
    private Integer volume = 30;
    private int canal = 1;

    @Override
    public boolean ehAtivo() {
        return this.on;
    }

    @Override
    public void ativar() {
        this.on = true;
    }

    @Override
    public void desativar() {
        this.on = false;
    }

    @Override
    public Integer getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(Integer volume) {
        if (this.volume > 100) {
            this.volume = 100;
        } else if (this.volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public Integer getCanal() {
        return this.canal;
    }

    @Override
    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    @Override
    public void exibirStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Tv:");
        System.out.println("| Está " + (on ? "ligada" : "desligada"));
        System.out.println("| Volume está em " + volume + "%");
        System.out.println("| Canal atual é " + canal);
        System.out.println("------------------------------------\n");
    }
}
