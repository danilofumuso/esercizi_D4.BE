package it.epicode.gestione_eventi.dao.eventiDAO;

import it.epicode.gestione_eventi.entity.eventi.Concerto;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ConcertoDAO {
    private EntityManager em;

    public void save(Concerto oggetto) {
        em.getTransaction().begin();
        em.persist(oggetto);
        em.getTransaction().commit();
    }

    public Concerto findById(Long id) {
        return em.find(Concerto.class, id);
    }

    public List<Concerto> findAll() {
        return em.createNamedQuery("Trova_tutto_Concerto", Concerto.class).getResultList();
    }

    public void update(Concerto oggetto) {
        em.getTransaction().begin();
        em.merge(oggetto);
        em.getTransaction().commit();
    }

    public void delete(Concerto oggetto) {
        em.getTransaction().begin();
        em.remove(oggetto);
        em.getTransaction().commit();
    }


}
