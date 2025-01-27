package estrutural.bridge;

public interface Dispositivo {
    boolean ehAtivo();

    void ativar();

    void desativar();

    Integer getVolume();

    void setVolume(Integer volume);

    Integer getCanal();

    void setCanal(Integer canal);

    void exibirStatus();
}
