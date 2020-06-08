package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.CommentaireDao;
import proust.dev.escalade.hibernate.entities.Commentaire;
import proust.dev.escalade.hibernate.entities.Utilisateur;
import proust.dev.escalade.services.interfaces.CommentaireService;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CommentaireServiceImpl implements CommentaireService {
    @Autowired
    CommentaireDao commentaireDao;

    @Override
    public List voirCommentaire(Integer spotId) {
        List commentaire = commentaireDao.findAllBySpotId(spotId);
        return commentaire;
    }

    @Override
    public void ajouterCommentaire(Integer spotId, Commentaire commentaire) {
        Date date = new Date();
        commentaire.setDate(date);
        commentaire.setSpotId(spotId);
        commentaireDao.save(commentaire);
    }

    @Override
    public List listerCommentaire(Utilisateur utilisateur) {
        List commentaires = commentaireDao.findAllByUtilisateur_UserId(utilisateur.getUserId());
        return commentaires;
    }

    @Override
    public void supprimerCommentaire(Integer comId) {
        Commentaire commentaire = commentaireDao.findByComId(comId);
        commentaireDao.delete(commentaire);
    }
}
