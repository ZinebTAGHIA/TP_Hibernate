/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.ArrayList;
import java.util.List;
import ma.projet.classes.Employe;
import ma.projet.dao.IDao;
import ma.projet.classes.Projet;
import ma.projet.classes.Tache;
import ma.projet.classes.EmployeTache;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjetService implements IDao<Projet> {

    @Override
    public boolean create(Projet o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Projet> getAll() {
        List<Projet> projets = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            projets = session.createQuery("from Projet").list();
            tx.commit();
            return projets;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return projets;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Projet getByID(int id) {
        Projet categ = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            categ = (Projet) session.get(Projet.class, id);
            tx.commit();
            return categ;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return categ;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void getAllTaches(Projet projet) {
        for (Tache tache : projet.getTaches()) {;
            System.out.println(projet);
        }
    }

    public void afficherTachesRealises(Projet projet) {
        System.out.println("Projet : " + projet.getId() + "   Nom: " + projet.getNom() + "    Date Début : " + projet.getDateDebut());
        System.out.println("Liste des taches :");
        System.out.println("Num   " + "   Nom   " + "   Date Début Réelle   " + "  Date Fin Réelle ");

        for (Tache tache : projet.getTaches()) {
            for (EmployeTache empTache : tache.getEmployeTaches()) {
                if (empTache.getDateDebutReelle() != null && empTache.getDateFinReelle() != null) {
                    System.out.println(String.format(tache.getId() + "       " + tache.getNom() + "       " + empTache.getDateDebutReelle()) + "          " + empTache.getDateFinReelle());
                }
            }
        }
    }

}
