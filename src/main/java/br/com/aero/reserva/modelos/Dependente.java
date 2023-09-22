package br.com.aero.reserva.modelos;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "dependentes")
public class Dependente {
    private String name;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    private String cpf;

    public Dependente() {
    }

    public Dependente(String name, LocalDate dataNascimento, String cpf) {
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }
}
