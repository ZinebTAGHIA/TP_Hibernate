/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Zineb
 */
@Embeddable
public class MariageKey implements Serializable{
    private int femme;
    private int homme;

    public MariageKey() {
    }

    public MariageKey(int femme, int homme) {
        this.femme = femme;
        this.homme = homme;
    }
    
}
