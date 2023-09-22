package br.com.aero.reserva.modelos;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "voo")
public class Voo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "num_aviao")
    private String numeroAviao;
    @ManyToMany
    private Cidade origem;
    @ManyToMany
    private Cidade destino;
    @Column(name = "data_horario")
    private LocalDateTime dataHorario;

    public Voo() {
    }

    public Voo(String numeroAviao, Cidade origem, Cidade destino, LocalDateTime dataHorario) {
        this.numeroAviao = numeroAviao;
        this.origem = origem;
        this.destino = destino;
        this.dataHorario = dataHorario;
    }

    public Long getId() {
        return id;
    }

    public String getNumeroAviao() {
        return numeroAviao;
    }

    public void setNumeroAviao(String numeroAviao) {
        this.numeroAviao = numeroAviao;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public LocalDateTime getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(LocalDateTime dataHorario) {
        this.dataHorario = dataHorario;
    }
}
