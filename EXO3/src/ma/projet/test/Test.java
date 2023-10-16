package ma.projet.test;

import ma.projet.classes.Employe;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.classes.EmployeTache;
import ma.projet.service.EmployeService;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;
import ma.projet.service.EmployeTacheService;
import ma.projet.util.HibernateUtil;
import java.util.Date;
import ma.projet.classes.EmployeTacheKey;

public class Test {

    public static void main(String[] args) {

//        EmployeService employeService = new EmployeService();
//        ProjetService projetService = new ProjetService();
        TacheService tacheService = new TacheService();
//        EmployeTacheService employeTacheService = new EmployeTacheService();
//
//        Employe employe = new Employe("John", "Doe", "123456789");
//        employeService.create(employe);
//
//
//        Projet projet = new Projet("Project1", java.sql.Date.valueOf("2023-01-01"), java.sql.Date.valueOf("2023-02-01"), employe);
//        projetService.create(projet);
//
//        Tache tache = new Tache("Task1", java.sql.Date.valueOf("2023-01-02"), java.sql.Date.valueOf("2023-01-05"), 2000, projet);
//        tacheService.create(tache);
//
//        EmployeTache employeTache = new EmployeTache(new EmployeTacheKey(employe.getId(), tache.getId()), employe, tache, new Date(), new Date());
//        employeTacheService.create(employeTache);
//        employeService.getAllTacheByEmp(employeService.getByID(1));
//        employeService.getAllProjets(employeService.getByID(1));
//        projetService.getAllTaches(projetService.getByID(1));
//        projetService.afficherTachesRealises(projetService.getByID(1));
//        System.out.println(tacheService.findByPrice(1000)); 
//        System.out.println(tacheService.findTachesBetweenDates(java.sql.Date.valueOf("2023-01-01"), java.sql.Date.valueOf("2023-10-03")));
        

    }
}
