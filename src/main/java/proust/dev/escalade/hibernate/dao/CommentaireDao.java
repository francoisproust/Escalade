package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proust.dev.escalade.hibernate.entities.Utilisateur;

import java.util.List;

@Repository
public interface CommentaireDao extends JpaRepository<Commentaire,Integer> {
    List findAllBySpotId(Integer spotId);
    List findAllByUtilisateur_UserId(Integer userId);
    Commentaire findByComId(Integer comId);
}
