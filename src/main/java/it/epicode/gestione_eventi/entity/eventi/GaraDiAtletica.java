package it.epicode.gestione_eventi.entity.eventi;

import it.epicode.gestione_eventi.entity.Evento;
import it.epicode.gestione_eventi.entity.Persona;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name="gare_di_atletica")
@NamedQuery(name = "Trova_tutto_GaraDiAtletica", query = "SELECT a FROM GaraDiAtletica a")
public class GaraDiAtletica extends Evento {

    @OneToMany(mappedBy = "garaDiAtletica")
    private Set<Persona> atleti = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona vincitore;

}
