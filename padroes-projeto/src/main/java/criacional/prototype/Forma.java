package criacional.prototype;

import java.util.Objects;

public abstract class Forma {
    public int x;
    public int y;
    public String cor;

    public Forma() {
    }

    public Forma(Forma forma) {
        if (forma != null) {
            this.x = forma.x;
            this.y = forma.y;
            this.cor = forma.cor;
        }
    }

    public abstract Forma clonar();

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Forma forma)) return false;
        return forma.x == x && forma.y == y && Objects.equals(forma.cor, cor);
    }

    @Override
    public String toString() {
        return "Forma{" +
                "x=" + x +
                ", y=" + y +
                ", cor='" + cor + '\'' +
                '}';
    }
}
