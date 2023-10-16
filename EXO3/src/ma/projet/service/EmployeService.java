/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.ArrayList;
import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.classes.Employe;
import ma.projet.classes.Tache;
import ma.projet.classes.EmployeTache;
import ma.projet.classes.Projet;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class EmployeService implements IDao<Employe> {

    @Override
    public boolean create(Employe o) {
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
    public List<Employe> getAll() {
        List<Employe> employes = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            employes = session.createQuery("from Employe").list();
            tx.commit();
            return employes;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return employes;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public Employe getByID(int id) {
        Employe categ = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            categ = (Employe) session.get(Employe.class, id);
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
    
    public void getAllTacheByEmp(Employe employe){
        for (EmployeTache empTache : employe.getEmployeTaches()) {;
            Tache tache = empTache.getTache();
            System.out.println(tache);
        }
    }
    
    public void getAllProjets(Employe employe){
        for (Projet projet : employe.getProjets()) {;
            System.out.println(projet);
        }
    }

}
