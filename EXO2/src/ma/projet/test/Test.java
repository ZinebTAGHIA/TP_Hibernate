/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import ma.projet.service.CategorieService;
import ma.projet.service.CommandeService;
import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;
import ma.projet.classes.*;
import ma.projet.service.LigneCommandeProduitService;

/**
 *
 * @author Zineb
 */
public class Test {

    public static void main(String[] args) throws ParseException {
        CategorieService cs = new CategorieService();
        ProduitService ps = new ProduitService();
        CommandeService coms = new CommandeService();
        LigneCommandeProduitService lcps = new LigneCommandeProduitService();

        // Create Categories
//        Categorie categorie1 = new Categorie("F11", "Electronics");
//        Categorie categorie2 = new Categorie("F12", "Clothing");
//        cs.create(categorie1);
//        cs.create(categorie2);
//
//        // Create Products
//        Produit produit1 = new Produit("REF1", 150, new Date(), categorie1);
//        Produit produit2 = new Produit("REF2", 200, new Date(), categorie1);
//        Produit produit3 = new Produit("REF3", 50, new Date(), categorie2);
//        Produit produit4 = new Produit("REF4", 80, new Date(), categorie2);
//        ps.create(produit1);
//        ps.create(produit2);
//        ps.create(produit3);
//        ps.create(produit4);
//
//        // Create Orders
//        Commande commande1 = new Commande("c23", new Date());
//        Commande commande2 = new Commande("c24", new Date());
//        coms.create(commande1);
//        coms.create(commande2);
//        
//        // Add products to orders
//        LigneCommandeProduit ligne1 = new LigneCommandeProduit(new LigneCommandeProduitKey(coms.getByID(1).getId(), ps.getByID(2).getId()), coms.getByID(1), ps.getByID(2), 2);
//        LigneCommandeProduit ligne2 = new LigneCommandeProduit(new LigneCommandeProduitKey(coms.getByID(1).getId(), ps.getByID(3).getId()), coms.getByID(1), ps.getByID(3), 3);
//        LigneCommandeProduit ligne3 = new LigneCommandeProduit(new LigneCommandeProduitKey(coms.getByID(2).getId(), ps.getByID(1).getId()), coms.getByID(2), ps.getByID(1), 1);
//        LigneCommandeProduit ligne4 = new LigneCommandeProduit(new LigneCommandeProduitKey(coms.getByID(2).getId(), ps.getByID(4).getId()), coms.getByID(2), ps.getByID(4), 4);
//
//        lcps.create(ligne1);
//        lcps.create(ligne2);
//        lcps.create(ligne3);
//        lcps.create(ligne4);
        
//        System.out.println(ps.findByCategory(cs.getByID(1)));
        
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date d1 = dateFormat.parse("2023-01-01");
//        Date d2 = dateFormat.parse("2023-10-10");
//
//        System.out.println(ps.findOrderedBetweenDates(d1, d2));

//        coms.afficherProduitsCommandes(coms.getByID(2));
        
        System.out.println(ps.findByPrice(100)); 
        
    }

}
