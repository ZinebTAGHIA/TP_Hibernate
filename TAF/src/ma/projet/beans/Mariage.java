/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Zineb
 */
@Entity
public class Mariage {
    @EmbeddedId
    private MariageKey id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebut;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    private int nbrEnfant;
    
    @ManyToOne
    @JoinColumn(name = "femme", referencedColumnName = "id", insertable = false, updatable = false)
    private Femme femme;

    @ManyToOne
    @JoinColumn(name = "homme", referencedColumnName = "id", insertable = false, updatable = false)
    private Homme homme;

    public Mariage() {
    }

    public Mariage(MariageKey id,Date dateDebut, Date dateFin, int nbrEnfant, Femme femme, Homme homme) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbrEnfant = nbrEnfant;
        this.femme = femme;
        this.homme = homme;
    }
    
    public MariageKey getId() {
        return id;
    }

    public void setId(MariageKey id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }
    
    
    
    
}
