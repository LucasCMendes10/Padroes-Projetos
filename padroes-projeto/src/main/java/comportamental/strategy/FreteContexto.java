package comportamental.strategy;

public class FreteContexto {

    private final FreteStrategy freteStrategy;

    public FreteContexto(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public Double calcularFrete(Double peso) {
        return freteStrategy.calcular(peso);
    }
}
