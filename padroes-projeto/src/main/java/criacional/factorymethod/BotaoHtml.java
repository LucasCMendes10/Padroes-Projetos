package criacional.factorymethod;

public class BotaoHtml implements Botao {

    @Override
    public void render() {
        System.out.println("<button>Botão de Teste</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click!");
    }
}
