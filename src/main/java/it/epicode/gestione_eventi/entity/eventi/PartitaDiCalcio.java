package it.epicode.gestione_eventi.entity.eventi;

import it.epicode.gestione_eventi.entity.Evento;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="partite_di_calcio")
@NamedQuery(name = "Trova_tutto_PartitaDiCalcio", query = "SELECT a FROM PartitaDiCalcio a")
public class PartitaDiCalcio extends Evento {

    @Column(name="squadra_di_casa", nullable = false)
    private String squadraDiCasa;

    @Column(name="squadra_ospite", nullable = false)
    private String squadraOspite;

    @Column(name="squadra_vincente")
    private String squadraVincente;

    @Column(name="gol_squadra_di_casa", nullable = false)
    private int golSquadraDiCasa;

    @Column(name="gol_squadra_ospite", nullable = false)
    private int golSquadraOspite;

}
