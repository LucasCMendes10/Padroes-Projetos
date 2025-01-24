package comportamental.strategy;

public class MainStrategy {
    public static void main(String[] args) {
        FreteContexto freteContextoNormal = new FreteContexto(new FreteNormal());
        FreteContexto freteContextoExpresso = new FreteContexto(new FreteExpresso());
        FreteContexto freteContextoTransportadora = new FreteContexto(new FreteTransportadora());

        Double peso = 10.0;

        System.out.printf("Frete normal: R$%.2f\n", freteContextoNormal.calcularFrete(peso));
        System.out.printf("Frete expresso: R$%.2f\n", freteContextoExpresso.calcularFrete(peso));
        System.out.printf("Frete transportadora: R$%.2f\n", freteContextoTransportadora.calcularFrete(peso));
    }
}
