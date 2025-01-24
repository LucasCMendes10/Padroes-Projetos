package estrutural.adapter;

public class UsuarioAdapter {

    public static UsuarioResponseDto toResponseDto(UsuarioEntidade usuarioEntidade) {
        return new UsuarioResponseDto(
                usuarioEntidade.getApelido(),
                usuarioEntidade.getEmail()
        );
    }
}
