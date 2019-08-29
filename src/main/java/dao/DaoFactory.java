package dao;

import dao.impl.*;
import dao.interfaces.*;

public class DaoFactory {
    //Recuperation du Dao
    public CommentaireDaoImpl getCommentaireDao() {
        return new CommentaireDaoImpl(this);
    }
    public CotationDaoImpl getCotationDao(){return new CotationDaoImpl(this);}
    public LongueurDaoImpl getLongueurDao(){return new LongueurDaoImpl(this);}
    public SecteurDaoImpl getSecteurDao(){return new SecteurDaoImpl(this);}
    public SpotDaoImpl getSpotDao(){return new SpotDaoImpl(this);}
    public TopoDaoImpl getTopoDao(){return new TopoDaoImpl(this);}
    public TypeUserDaoImpl getTypeUserDao(){return new TypeUserDaoImpl(this);}
    public UtilisateurDao getUtilisateurDao(){
        return new UtilisateurDaoImpl(this);
    }
    public VoieDaoImpl getVoieDao(){return new VoieDaoImpl(this);}
}
