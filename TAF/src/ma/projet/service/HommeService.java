/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

import java.util.Date;
import java.util.List;
import ma.projet.beans.Homme;
import ma.projet.beans.Femme;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Zineb
 */
public class HommeService implements IDao<Homme>{
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    @Override
    public boolean create(Homme o) {
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
    public List<Homme> getAll() {
        List<Homme> hommes = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            hommes = session.createQuery("from Homme").list();
            tx.commit();
            return hommes;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return hommes;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public Homme getByID(int id) {
        Homme homme = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            homme = (Homme) session.get(Homme.class, id);
            tx.commit();
            return homme;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return homme;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public List<Femme> getEpousesEntreDates(int hommeId, Date dateDebut, Date dateFin) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        String hql = "SELECT DISTINCT f " +
                     "FROM Homme h " +
                     "JOIN h.mariages m " +
                     "JOIN m.femme f " +
                     "WHERE h.id = :hommeId " +
                     "AND m.dateDebut >= :dateDebut " +
                     "AND m.dateFin <= :dateFin";

        Query query = session.createQuery(hql);
        query.setParameter("hommeId", hommeId);
        query.setParameter("dateDebut", dateDebut);
        query.setParameter("dateFin", dateFin);

        return query.list();
}

}
