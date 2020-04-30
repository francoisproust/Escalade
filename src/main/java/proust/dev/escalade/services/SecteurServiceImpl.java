package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.SecteurDao;
import proust.dev.escalade.hibernate.dao.SpotDao;
import proust.dev.escalade.hibernate.entities.Secteur;
import proust.dev.escalade.hibernate.entities.Spot;
import proust.dev.escalade.services.interfaces.SecteurService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecteurServiceImpl implements SecteurService {
    @Autowired
    SecteurDao secteurDao;

    @Autowired
    SpotDao spotDao;

    public List listerSecteur(){
        List listerSecteur = new ArrayList();
        listerSecteur = secteurDao.findAll();
        return listerSecteur;
    }

    @Override
    public List voirSecteur(Integer spotId) {
        List voirSecteur = new ArrayList();
        voirSecteur = secteurDao.findAllBySpot_SpotId(spotId);
        return voirSecteur;
    }

    @Override
    public void ajouterSecteur(Secteur secteur, Integer spotId) {
        Spot spot = spotDao.findBySpotId(spotId);
        secteur.setSpot(spot);
        secteurDao.save(secteur);
    }
}
