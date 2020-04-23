package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.UtilisateurDao;
import proust.dev.escalade.hibernate.entities.Utilisateur;
import proust.dev.escalade.services.interfaces.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    UtilisateurDao utilisateurDao;

    public List listerUtilisateur(){
        List listerUtilisateur = new ArrayList();
        listerUtilisateur = (List) utilisateurDao.findAll();
        return listerUtilisateur ;
    }
    public void findUtilisateurByPseudo(Utilisateur utilisateur){
        //String userId = utilisateurDao.findByPseudo(utilisateu);
        //int userId = utilisateur.getUserId();
       // return userId;
    }


}
