package it.epicode.gestione_eventi.dao.eventiDAO;

import it.epicode.gestione_eventi.entity.eventi.GaraDiAtletica;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GaraDiAtleticaDAO {
    private EntityManager em;

    public void save(GaraDiAtletica oggetto) {
        em.getTransaction().begin();
        em.persist(oggetto);
        em.getTransaction().commit();
    }

    public GaraDiAtletica findById(Long id) {
        return em.find(GaraDiAtletica.class, id);
    }

    public List<GaraDiAtletica> findAll() {
        return em.createNamedQuery("Trova_tutto_GaraDiAtletica", GaraDiAtletica.class).getResultList();
    }

    public void update(GaraDiAtletica oggetto) {
        em.getTransaction().begin();
        em.merge(oggetto);
        em.getTransaction().commit();
    }

    public void delete(GaraDiAtletica oggetto) {
        em.getTransaction().begin();
        em.remove(oggetto);
        em.getTransaction().commit();
    }


}
