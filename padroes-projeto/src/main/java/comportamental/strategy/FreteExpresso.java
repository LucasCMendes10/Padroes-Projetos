package comportamental.strategy;

public class FreteExpresso implements FreteStrategy {

    @Override
    public Double calcular(Double peso) {
        return peso * 3.0;
    }
}
