package dao;


import dao.impl.UtilisateurDaoImpl;

public class DaoFactory {

    //Recuperation du Dao
    public UtilisateurDao getUtilisateurDao(){
        return new UtilisateurDaoImpl(this);
    }
}
