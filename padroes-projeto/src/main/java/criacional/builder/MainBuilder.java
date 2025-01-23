package criacional.builder;

import java.time.LocalDate;

public class MainBuilder {
    public static void main(String[] args) {
        Usuario usuario = new Usuario.Builder()
                .nome("Lucas")
                .dtNasc(LocalDate.parse("2000-01-01"))
                .peso(50.0)
                .build();
    }
}
