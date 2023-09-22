package br.com.aero.reserva.dao;


import br.com.aero.reserva.modelos.Passageiro;

import javax.persistence.EntityManager;

public class PassageiroDao {

    private EntityManager em;

    public PassageiroDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Passageiro passageiro) {
        this.em.persist(passageiro);
    }

    public void alterar(Passageiro passageiro) {
        this.em.merge(passageiro);
    }

    public void remover(Passageiro passageiro) {
        passageiro = em.merge(passageiro);
        this.em.remove(passageiro);
    }

}
