package dao.impl;

import dao.DaoFactory;
import dao.interfaces.UtilisateurDao;
import hibernate.entities.Utilisateur;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtils;


public class UtilisateurDaoImpl implements UtilisateurDao {
    private DaoFactory daoFactory;
    public UtilisateurDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public void createUtilisateur(Utilisateur utilisateur) {
        SessionFactory factory = HibernateUtils.getSessionFactory();
        Session session = factory.getCurrentSession();
        try{
            session.getTransaction().begin();
            session.persist(utilisateur);
            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
            session.getTransaction().rollback();
        }
    }

    @Override
    public void modifierUtilisateur(Utilisateur utilisateur) {

    }
}
