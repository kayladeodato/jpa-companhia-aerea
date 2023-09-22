package br.com.aero.reserva.modelos;

import javax.persistence.*;

@Entity
@Table(name = "assento")
public class Assento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeracao;
    @ManyToOne (fetch = FetchType.LAZY)
    private Voo voo;
    @ManyToOne (fetch = FetchType.LAZY)
    private Passageiro passageiro;

    public Assento() {
    }

    public Assento(String numeracao, Voo voo, Passageiro passageiro) {
        this.numeracao = numeracao;
        this.voo = voo;
        this.passageiro = passageiro;
    }

    public Long getId() {
        return id;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
}
