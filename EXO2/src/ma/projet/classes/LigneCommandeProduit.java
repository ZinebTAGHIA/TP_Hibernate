/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Zineb
 */
@Entity
public class LigneCommandeProduit {
    
    @EmbeddedId
    private LigneCommandeProduitKey id;
    @JoinColumn(name = "commande", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private Commande commande;
    @JoinColumn(name = "produit", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private Produit produit;
    private int quantite;

    public LigneCommandeProduit() {
    }

    public LigneCommandeProduit(LigneCommandeProduitKey id, Commande commande, Produit produit, int quantite) {
        this.id = id;
        this.commande = commande;
        this.produit = produit;
        this.quantite = quantite;
    }

    public LigneCommandeProduitKey getId() {
        return id;
    }

    public void setId(LigneCommandeProduitKey id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    
}
