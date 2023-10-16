/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Zineb
 */
@Embeddable
public class LigneCommandeProduitKey implements Serializable{
    
    private int commande;
    private int produit;

    public LigneCommandeProduitKey() {
    }

    public LigneCommandeProduitKey(int commande, int produit) {
        this.commande = commande;
        this.produit = produit;
    }
    
}
