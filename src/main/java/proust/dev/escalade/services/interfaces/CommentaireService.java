package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Commentaire;
import proust.dev.escalade.hibernate.entities.Utilisateur;

import java.util.List;

public interface CommentaireService {
    List voirCommentaire(Integer spotId);
    void ajouterCommentaire(Integer spotId, Commentaire commentaire);
    List listerCommentaire(Utilisateur utilisateur);
    void supprimerCommentaire(Integer comId);
    void modifierCommentaire(Commentaire commentaire);
    Commentaire voirCommentaireById(Integer comId);
    List listerTousCommentaires();
}
