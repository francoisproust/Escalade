package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService {
    abstract List listerUtilisateur();

    void findUtilisateurByPseudo(Utilisateur utilisateur);
}
