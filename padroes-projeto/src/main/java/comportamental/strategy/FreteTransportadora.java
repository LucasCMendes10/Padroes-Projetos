package comportamental.strategy;

public class FreteTransportadora implements FreteStrategy {

    @Override
    public Double calcular(Double peso) {
        return 50 + (peso * 2.0);
    }
}
