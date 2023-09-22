package br.com.aero.reserva.dao;

import br.com.aero.reserva.modelos.Voo;

import javax.persistence.EntityManager;

public class VooDao {

    private EntityManager em;

    public VooDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Voo voo) {
        this.em.persist(voo);
    }

    public void alterar(Voo voo) {
        this.em.merge(voo);
    }

    public void remover(Voo voo) {
        voo = em.merge(voo);
        this.em.remove(voo);
    }

}
