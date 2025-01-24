package criacional.prototype;

public class Circulo extends Forma {
    public int raio;

    public Circulo() {
    }

    public Circulo(Circulo circulo) {
        super(circulo);
        if (circulo != null) {
            this.raio = circulo.raio;
        }
    }

    @Override
    public Forma clonar() {
        return new Circulo(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circulo circulo) || !super.equals(object)) return false;
        return circulo.raio == raio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                "} " + super.toString();
    }
}
