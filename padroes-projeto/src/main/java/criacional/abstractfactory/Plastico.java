package criacional.abstractfactory;

public class Plastico implements Material {

    @Override
    public void comprar() {
        System.out.println("Você comprou plástico");
    }
}
