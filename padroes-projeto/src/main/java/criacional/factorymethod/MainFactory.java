package criacional.factorymethod;

public class MainFactory {

    public static void main(String[] args) {
        clicar("Windowns");
        clicar("Linux");
    }

    public static void clicar(String sistema) {
        Botao botao;
        if (sistema.equalsIgnoreCase("Windowns")) {
            botao = new BotaoWindowns();
        } else {
            botao = new BotaoHtml();
        }

        botao.render();
    }
}
