package comportamental.strategy;

public class FreteNormal implements FreteStrategy {

    @Override
    public Double calcular(Double peso) {
        return peso * 1.5;
    }
}
