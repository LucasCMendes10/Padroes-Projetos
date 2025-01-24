package criacional.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.x = 10;
        circulo.y = 20;
        circulo.raio = 15;
        circulo.cor = "azul";

        Circulo circuloCopiado = (Circulo) circulo.clonar();

        System.out.println(circulo.equals(circuloCopiado));
        System.out.println("Círculo Original: " + circulo);
        System.out.println("Círculo Copiado: " + circuloCopiado);
    }
}
