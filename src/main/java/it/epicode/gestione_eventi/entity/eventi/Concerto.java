package it.epicode.gestione_eventi.entity.eventi;

import it.epicode.gestione_eventi.entity.Evento;
import it.epicode.gestione_eventi.entity.enums.GenereEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="concerti")
@NamedQuery(name = "Trova_tutto_Concerto", query = "SELECT a FROM Concerto a")
public class Concerto extends Evento {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private GenereEnum genere;

    @Column(name = "in_streaming", nullable = false)
    private boolean inStreaming;
}
