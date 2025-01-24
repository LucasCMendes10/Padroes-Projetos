package criacional.singleton;

public class Database {

    private static Database instance;

    private Database() {
        // Código de inicialização da conexão com banco de dados
    }

    public static Database getInstance() {
        if (instance == null) instance = new Database();
        return instance;
    }
}
