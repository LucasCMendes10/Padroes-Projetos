package criacional.abstractfactory;

public class Madeira implements Material {

    @Override
    public void comprar() {
        System.out.println("Você comprou madeira");
    }
}
