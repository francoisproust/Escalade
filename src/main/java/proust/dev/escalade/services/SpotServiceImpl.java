package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.SpotDao;
import proust.dev.escalade.hibernate.dao.UtilisateurDao;
import proust.dev.escalade.hibernate.entities.Spot;
import proust.dev.escalade.hibernate.entities.Utilisateur;
import proust.dev.escalade.services.interfaces.SpotService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SpotServiceImpl implements SpotService {
    @Autowired
    SpotDao spotDao;
    UtilisateurDao utilisateurDao;

    public List listerSpot(){
        List listerSpot = new ArrayList();
        listerSpot = spotDao.findAll();
        return listerSpot;
    }

    public void ajouterSpot(Spot spot){

        spotDao.save(spot);
    }
}
