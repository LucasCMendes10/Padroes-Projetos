package estrutural.adapter;

import java.time.LocalDate;

public class MainAdapter {
    public static void main(String[] args) {
        UsuarioEntidade usuarioCadastrado = new UsuarioEntidade(
                "Lucas", LocalDate.parse("2000-01-01"), "LCM", "lucas@email.com", "senha");
        UsuarioResponseDto usuarioExibido = UsuarioAdapter.toResponseDto(usuarioCadastrado);

        System.out.printf("""
                Esse é seu usuário:
                Apelido: %s
                E-mail: %s""", usuarioExibido.getApelido(), usuarioExibido.getEmail());
    }
}
