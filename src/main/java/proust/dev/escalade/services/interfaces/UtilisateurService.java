package proust.dev.escalade.services.interfaces;

import org.springframework.security.core.userdetails.UserDetailsService;
import proust.dev.escalade.hibernate.entities.Utilisateur;

import java.util.List;

public interface UtilisateurService extends UserDetailsService {
    abstract List listerUtilisateur();
    void ajouterUtilisateur(Utilisateur utilisateur);
    void findUtilisateurByPseudo(Utilisateur utilisateur);
}
