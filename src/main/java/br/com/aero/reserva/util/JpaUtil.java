package br.com.aero.reserva.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("companhia_aerea");

    public static EntityManager getEntityManager() {
        return FACTORY.createEntityManager();
    }
}
