package br.com.aero.reserva.dao;

import br.com.aero.reserva.modelos.Endereco;

import javax.persistence.EntityManager;

public class EnderecoDao {

    private EntityManager em;

    public EnderecoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Endereco endereco) {
        this.em.persist(endereco);
    }

    public void alterar(Endereco endereco) {
        this.em.merge(endereco);
    }

    public void remover(Endereco endereco) {
        endereco = em.merge(endereco);
        this.em.remove(endereco);
    }

}
