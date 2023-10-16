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
public class EmployeTacheKey implements Serializable{
    private int employe;
    private int tache;

    public EmployeTacheKey() {
    }

    public EmployeTacheKey(int employe, int tache) {
        this.employe = employe;
        this.tache = tache;
    }
    
}
