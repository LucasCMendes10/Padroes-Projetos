package criacional.singleton;

public class MainSingleton {
    public static void main(String[] args) {
//        Database banco = new Database(); -> Construtor privado proibe de acontecer esses casos
        Database banco1 = Database.getInstance(); // 1° Chamando a instância do objeto cria ele
        Database banco2 = Database.getInstance(); // 2° Chamando a instância do objeto retorna o mesmo objeto criado acima

        System.out.println(banco1 == banco2); // essa comparação só retorna true porque a instância do objeto é a mesma
    }
}
