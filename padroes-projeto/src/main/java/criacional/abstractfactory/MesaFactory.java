package criacional.abstractfactory;

public class MesaFactory implements ConstrutoraFactory {

    @Override
    public Mobilia criarMobilia() {
        return new Mesa();
    }

    @Override
    public Material comprarMaterial() {
        return new Madeira();
    }
}
