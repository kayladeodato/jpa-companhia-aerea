package br.com.aero.reserva.dao;

import br.com.aero.reserva.modelos.Cidade;

import javax.persistence.EntityManager;

public class CidadeDao {

    private EntityManager em;

    public CidadeDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Cidade cidade) {
        this.em.persist(cidade);
    }

    public void alterar(Cidade cidade) {
        this.em.merge(cidade);
    }

    public void remover(Cidade cidade) {
        cidade = em.merge(cidade);
        this.em.remove(cidade);
    }

}
