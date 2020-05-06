package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.LongueurDao;
import proust.dev.escalade.hibernate.dao.VoieDao;
import proust.dev.escalade.hibernate.entities.Longueur;
import proust.dev.escalade.hibernate.entities.Voie;
import proust.dev.escalade.services.interfaces.LongueurService;

import java.util.ArrayList;
import java.util.List;

@Service
public class LongueurServiceImpl implements LongueurService {
    @Autowired
    LongueurDao longueurDao;
    @Autowired
    VoieDao voieDao;

     public List listerLongueur(){
        List listerLongueur = new ArrayList();
        listerLongueur = longueurDao.findAll();
        return listerLongueur;
    }

    public void ajouterLongueur(Longueur longueur, Integer voieId) {
        Voie voie = voieDao.findByVoieId(voieId);
        longueur.setVoie(voie);
        longueurDao.save(longueur);
    }

    @Override
    public List voirLongueur(Integer voieId) {
         List voies = longueurDao.findAllByVoie_VoieId(voieId);
        return voies;
    }

    @Override
    public Longueur voirLongueurParId(Integer longueurId) {
        Longueur longueur = voirLongueurParId(longueurId);
        return longueur;
    }
}
