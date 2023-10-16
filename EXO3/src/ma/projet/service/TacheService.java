/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.classes.Tache;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TacheService implements IDao<Tache> {

    @Override
    public boolean create(Tache o) {
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
    public List<Tache> getAll() {
        List<Tache> taches = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            taches = session.createQuery("from Tache").list();
            tx.commit();
            return taches;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return taches;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Tache getByID(int id) {
        Tache tache = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            tache = (Tache) session.get(Tache.class, id);
            tx.commit();
            return tache;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return tache;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public List<Tache> findByPrice(float price) {
        List<Tache> taches = null;
        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();

            Query query = session.getNamedQuery("Tache.findByPrice");
            query.setParameter("price", price);
            taches = query.list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return taches;
            
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return taches;
    }
    
        public List<Tache> findTachesBetweenDates(Date startDate, Date endDate) {
        List<Tache> taches = null;
        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();

            String hql = "SELECT DISTINCT t FROM Tache t JOIN t.employeTaches empt  WHERE empt.dateDebutReelle BETWEEN :startDate AND :endDate and empt.dateFinReelle BETWEEN :startDate AND :endDate";
            Query query = session.createQuery(hql);
            query.setParameter("startDate", startDate);
            query.setParameter("endDate", endDate);
            taches = query.list();

            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
            return taches;
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return taches;
    }

}
