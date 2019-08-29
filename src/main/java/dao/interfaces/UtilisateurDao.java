package dao.interfaces;

import hibernate.entities.Utilisateur;

public interface UtilisateurDao{
    public void createUtilisateur(Utilisateur utilisateur);
    public void modifierUtilisateur(Utilisateur utilisateur);

}
