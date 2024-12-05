package it.epicode.gestione_eventi.entity;


import it.epicode.gestione_eventi.entity.enums.StatoPartecipazioneEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "partecipazioni")
public class Partecipazione {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatoPartecipazioneEnum stato;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
}
