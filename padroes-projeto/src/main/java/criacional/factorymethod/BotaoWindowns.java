package criacional.factorymethod;

public class BotaoWindowns implements Botao {

    @Override
    public void render() {
        System.out.println("Botão do Teste do Windowns");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Click!");
    }
}
