package it.epicode.gestione_eventi.entity;

import it.epicode.gestione_eventi.entity.enums.EventoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "eventi")
@Inheritance(strategy = InheritanceType.JOINED)
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String titolo;

    @Column(name = "data_evento", nullable = false)
    private LocalDate dataEvento;

    @Column(nullable = false)
    private String descrizione;

    @Column(name = "tipo_evento", nullable = false)
    @Enumerated(EnumType.STRING)
    private EventoEnum tipoEvento;

    @Column(name = "partecipanti_max", nullable = false)
    private int numeroMassimoPartecipanti;

    @OneToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.REMOVE)
    private List<Partecipazione> listaPartecipazioni = new ArrayList<>();

}