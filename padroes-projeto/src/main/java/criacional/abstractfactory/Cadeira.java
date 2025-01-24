package criacional.abstractfactory;

public class Cadeira implements Mobilia {

    @Override
    public void criar() {
        System.out.println("Você criou uma cadeira");
    }
}
