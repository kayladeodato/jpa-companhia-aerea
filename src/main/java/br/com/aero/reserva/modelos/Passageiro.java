package br.com.aero.reserva.modelos;

import javax.persistence.*;

@Entity
@Table(name = "passageiro")
public class Passageiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Embedded
    private DadosPessoais dadosPessoais;
    @ManyToOne
    private Dependente dependente;
    @OneToOne
    private Endereco endereco;

    public Passageiro() {
    }

    public Passageiro(DadosPessoais dadosPessoais, Dependente dependente, Endereco endereco) {
        this.dadosPessoais = dadosPessoais;
        this.dependente = dependente;
        this.endereco = endereco;
    }

    public Passageiro(DadosPessoais dadosPessoais, Endereco endereco) {
        this.dadosPessoais = dadosPessoais;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
