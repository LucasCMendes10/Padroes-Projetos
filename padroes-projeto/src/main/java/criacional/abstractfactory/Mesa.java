package criacional.abstractfactory;

public class Mesa implements Mobilia {

    @Override
    public void criar() {
        System.out.println("Você criou uma Mesa");
    }
}
