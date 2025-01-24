package criacional.abstractfactory;

public class CadeiraFactory implements ConstrutoraFactory {

    @Override
    public Mobilia criarMobilia() {
        return new Cadeira();
    }

    @Override
    public Material comprarMaterial() {
        return new Plastico();
    }
}
