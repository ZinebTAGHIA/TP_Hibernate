/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.ArrayList;
import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.classes.Categorie;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CategorieService implements IDao<Categorie> {

    @Override
    public boolean create(Categorie o) {
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
    public List<Categorie> getAll() {
        List<Categorie> categs = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            categs = session.createQuery("from Categorie").list();
            tx.commit();
            return categs;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return categs;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public Categorie getByID(int id) {
        Categorie categ = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            categ = (Categorie) session.get(Categorie.class, id);
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

}
