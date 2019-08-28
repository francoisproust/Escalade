package dao.impl;

import dao.DaoFactory;
import dao.UtilisateurDao;
import hibernate.entities.Utilisateur;

public class UtilisateurDaoImpl implements UtilisateurDao {
    private DaoFactory daoFactory;
    public UtilisateurDaoImpl(DaoFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    @Override
    public void create(Utilisateur utilisateur) {

    }
}
