/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
@NamedQuery(name = "Produit.findByPrice", query = "SELECT p FROM Produit p WHERE p.prix > :price")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ref;
    private float prix;
    @ManyToOne
    private Categorie categ;
    @OneToMany(mappedBy = "produit")
    private List<LigneCommandeProduit> ligneCommandeProduits;

    public Produit() {
        this.ligneCommandeProduits = new ArrayList<>();

    }

    public Produit(String ref, float prix, Date dateAchat, Categorie categ) {
        this.ref = ref;
        this.prix = prix;
        this.categ = categ;
        this.ligneCommandeProduits = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public List<LigneCommandeProduit> getLigneCommandeProduits() {
        return ligneCommandeProduits;
    }

    public void setLigneCommandeProduits(List<LigneCommandeProduit> ligneCommandeProduits) {
        this.ligneCommandeProduits = ligneCommandeProduits;
    }

        @Override
    public String toString() {
        return "Produit "+this.id+" : "+
                this.ref+" "+this.prix;
    }
}
