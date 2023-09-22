package br.com.aero.reserva.dao;

import br.com.aero.reserva.modelos.Assento;

import javax.persistence.EntityManager;

public class AssentoDao {

    private EntityManager em;

    public AssentoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Assento assento) {
        this.em.persist(assento);
    }

    public void alterar(Assento assento) {
        this.em.merge(assento);
    }

    public void remover(Assento assento) {
        assento = em.merge(assento);
        this.em.remove(assento);
    }
}
