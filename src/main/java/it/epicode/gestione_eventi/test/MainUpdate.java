package it.epicode.gestione_eventi.test;

import com.github.javafaker.Faker;
import it.epicode.gestione_eventi.dao.EventoDAO;
import it.epicode.gestione_eventi.entity.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.Locale;

public class MainUpdate {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit-jpa");

        EntityManager em = emf.createEntityManager();

        EventoDAO eventoDAO = new EventoDAO(em);
        Evento e = eventoDAO.findEventoById(1L);
//        e.setTitolo("Ciao");
//
//        eventoDAO.updateEvento(e);
        eventoDAO.deleteEvento(e);

        em.close();
        emf.close();


    }
}
