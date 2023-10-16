/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import ma.projet.entity.Produit;
import ma.projet.service.ProduitService;

/**
 *
 * @author Zineb
 */
public class Test {

    public static void main(String args[]) throws ParseException {
            
            ProduitService ps = new ProduitService();
//            
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            Date d1 = dateFormat.parse("2023-02-01");
            
            
//        ps.create(new Produit("M1", "Ref1", new Date(), 100.00, "Prod1"));
//        ps.create(new Produit("M2", "Ref2", new Date(), 200.00, "Prod2"));
//        ps.create(new Produit("M3", "Ref3", new Date(), 300.00, "Prod3"));
//        ps.create(new Produit("M4", "Ref4", new Date(), 400.00, "Prod4"));
//        ps.create(new Produit("M5", "Ref5", new Date(), 500.00, "Prod5"));
//        ps.create(new Produit("M7", "Ref7", d1, 90.00, "Prod7"));
//        System.out.println(ps.findAll());
//        
//        System.out.println(ps.findByID(2));
//        
//        ps.delete(ps.findByID(3));
//       
//        Produit p = ps.findByID(1);
//        p.setPrix(400.00);
//        ps.update(p);
//        
//       System.out.println(ps.findByPrice100());
//

        System.out.println(ps.findByDate());

            

    }
}
