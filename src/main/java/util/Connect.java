package util;

import dao.interfaces.UtilisateurDao;
import hibernate.entities.Utilisateur;

import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) throws SQLException {
       HibernateUtils.getSessionFactory().openSession();
        /**
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("proust");
        utilisateur.setPrenom("francois");
        UtilisateurDao createUtilisateur = null;
        createUtilisateur.createUtilisateur(utilisateur);
         **/
    }
}