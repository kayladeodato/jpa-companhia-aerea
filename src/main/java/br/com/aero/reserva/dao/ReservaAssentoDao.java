package br.com.aero.reserva.dao;

import br.com.aero.reserva.modelos.ReservaAssento;

import javax.persistence.EntityManager;

public class ReservaAssentoDao {

    private EntityManager em;

    public ReservaAssentoDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(ReservaAssento reservaAssento) {
        this.em.persist(reservaAssento);
    }

    public void alterar(ReservaAssento reservaAssento) {
        this.em.merge(reservaAssento);
    }

    public void remover(ReservaAssento reservaAssento) {
        reservaAssento = em.merge(reservaAssento);
        this.em.remove(reservaAssento);
    }

}
