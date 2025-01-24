package criacional.abstractfactory;

public class MainAbstractFactory {
    public static void main(String[] args) {
        ConstrutoraFactory construtoraFactory = new CadeiraFactory();

        Mobilia cadeira = construtoraFactory.criarMobilia();
        Material plastico = construtoraFactory.comprarMaterial();
    }
}
