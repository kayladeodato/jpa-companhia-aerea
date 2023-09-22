package br.com.aero.reserva.dao;

import br.com.aero.reserva.modelos.DadosPessoais;

import javax.persistence.EntityManager;

public class DadosPessoaisDao {

    private EntityManager em;

    public DadosPessoaisDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(DadosPessoais dadosPessoais) {
        this.em.persist(dadosPessoais);
    }

    public void alterar(DadosPessoais dadosPessoais) {
        this.em.merge(dadosPessoais);
    }

    public void remover(DadosPessoais dadosPessoais) {
        dadosPessoais = em.merge(dadosPessoais);
        this.em.remove(dadosPessoais);
    }

}
