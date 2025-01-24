package estrutural.adapter;

import java.time.LocalDate;

public class UsuarioEntidade {

    private String nome;
    private LocalDate dtNasc;
    private String apelido;
    private String email;
    private String senha;

    public UsuarioEntidade(String nome, LocalDate dtNasc, String apelido, String email, String senha) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.apelido = apelido;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(LocalDate dtNasc) {
        this.dtNasc = dtNasc;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
