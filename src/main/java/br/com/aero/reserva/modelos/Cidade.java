package br.com.aero.reserva.modelos;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
@Embeddable
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String estado;
    private String sigla;

    public Cidade() {
    }

    public Cidade(String nome, String estado, String sigla) {
        this.nome = nome;
        this.estado = estado;
        this.sigla = sigla;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
