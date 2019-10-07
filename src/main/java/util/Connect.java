package util;

import java.sql.SQLException;

public class Connect {
    public static void main(String[] args) throws SQLException {
       HibernateUtils.getSessionFactory().openSession();
       System.out.println("tout va bien!!!!!!");
        /**
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom("proust");
        utilisateur.setPrenom("francois");
        UtilisateurDao createUtilisateur = null;
        createUtilisateur.createUtilisateur(utilisateur);
         **/
    }
}