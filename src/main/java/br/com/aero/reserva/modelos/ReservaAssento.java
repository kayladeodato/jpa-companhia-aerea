package br.com.aero.reserva.modelos;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "reserva_assento")
public class ReservaAssento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data = LocalDateTime.now();
    private String situacao;
    private Passageiro cliente;
    private Assento assento;
    private Voo voo;
    private Integer quantidadeAssento;
    private BigDecimal valor;

    public ReservaAssento() {
    }

    public ReservaAssento(Passageiro cliente, Assento assento, Voo voo, Integer quantidadeAssento, BigDecimal valor, String situacao) {
        this.situacao = situacao;
        this.cliente = cliente;
        this.assento = assento;
        this.voo = voo;
        this.quantidadeAssento = quantidadeAssento;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Passageiro getCliente() {
        return cliente;
    }

    public void setCliente(Passageiro cliente) {
        this.cliente = cliente;
    }

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public Integer getQuantidadeAssento() {
        return quantidadeAssento;
    }

    public void setQuantidadeAssento(Integer quantidadeAssento) {
        this.quantidadeAssento = quantidadeAssento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
