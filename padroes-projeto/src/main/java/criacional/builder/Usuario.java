package criacional.builder;

import java.time.LocalDate;

public class Usuario {

    private String nome;
    private LocalDate dtNasc;
    private String genero;
    private Double altura;
    private Double peso;

    public Usuario() {
    }

    public Usuario(String nome, LocalDate dtNasc, String genero, Double altura, Double peso) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public static class Builder {

        private String nome;
        private LocalDate dtNasc;
        private String genero;
        private Double altura;
        private Double peso;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder dtNasc(LocalDate dtNasc) {
            this.dtNasc = dtNasc;
            return this;
        }

        public Builder genero(String genero) {
            this.genero = genero;
            return this;
        }

        public Builder altura(Double altura) {
            this.altura = altura;
            return this;
        }

        public Builder peso(Double peso) {
            this.peso = peso;
            return this;
        }

        public Usuario build() {
            return new Usuario(
                    this.nome,
                    this.dtNasc,
                    this.genero,
                    this.altura,
                    this.peso
            );
        }
    }
}
