/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Zineb
 */
@Entity
public class Femme extends Personne{
    @OneToMany(mappedBy = "femme")
    private List<Mariage> mariages = new ArrayList<>();
    
    public Femme() {
    }

    public Femme(String nom, String prenom, String tel, String adresse, Date dateNaissance) {
        super(nom, prenom, tel, adresse, dateNaissance);
    }

    public List<Mariage> getMariages() {
        return mariages;
    }

    public void setMariages(List<Mariage> mariages) {
        this.mariages = mariages;
    }

    
    
    

    
}
