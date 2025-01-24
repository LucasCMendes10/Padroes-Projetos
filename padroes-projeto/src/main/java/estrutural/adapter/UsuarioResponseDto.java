package estrutural.adapter;

public class UsuarioResponseDto {

    private String apelido;
    private String email;

    public UsuarioResponseDto(String apelido, String email) {
        this.apelido = apelido;
        this.email = email;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
