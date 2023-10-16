/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import ma.projet.beans.Mariage;
import ma.projet.beans.MariageKey;
import ma.projet.service.HommeService;
import ma.projet.service.FemmeService;
import ma.projet.service.MariageService;
import ma.projet.util.HibernateUtil;

/**
 *
 * @author Zineb
 */
public class Test {

    public static void main(String[] args) {
//        HibernateUtil.getSessionFactory();    
//        HommeService hs = new HommeService();
//        FemmeService fs = new FemmeService();
//        MariageService ms = new MariageService();
//       
//        Calendar cal = Calendar.getInstance();
//        cal.set(2001, 0, 19);
//        Date d1= cal.getTime();
//        
//        cal.set(2019, 0, 1);
//        Date d2 = cal.getTime();
//        
//        cal.set(2022, 0, 1);
//        Date d3 = cal.getTime();
//        
//        Homme h = new Homme("Nom1", "Prenom1", "06666666", "Adr1", d1);
//        Femme f = new Femme("Nom1", "Prenom1", "07777777", "Adr1", d1);
//        MariageKey mk = new MariageKey(f.getId(), h.getId());
//        Mariage m = new Mariage(mk,d2, d3, 1, fs.getByID(2), hs.getByID(1));
////        hs.create(h);
////        fs.create(f);
////        h.getMariages().add(m); 
////        f.getMariages().add(m);
//        
//
//        ms.create(m);
//        
//        List<Femme> epouses = hs.getEpousesEntreDates(1, d2, d3);
//
//// Afficher les épouses
//for (Femme epouse : epouses) {
//    System.out.println("Nom: " + epouse.getNom() + ", Prénom: " + epouse.getPrenom());
//}
    }
}
