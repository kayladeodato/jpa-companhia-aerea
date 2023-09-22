package br.com.aero.reserva.dao;

import br.com.aero.reserva.modelos.Dependente;

import javax.persistence.EntityManager;

public class DependenteDao {

    private EntityManager em;

    public DependenteDao(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Dependente dependente) {
        this.em.persist(dependente);
    }

    public void alterar(Dependente dependente) {
        this.em.merge(dependente);
    }

    public void remover(Dependente dependente) {
        dependente = em.merge(dependente);
        this.em.remove(dependente);
    }

}
