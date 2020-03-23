package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.LongueurDao;
import proust.dev.escalade.hibernate.entities.Longueur;
import proust.dev.escalade.services.interfaces.LongueurService;

import java.util.ArrayList;
import java.util.List;

@Service
public class LongueurServiceImpl implements LongueurService {
    @Autowired
    LongueurDao longueurDao;

     public List listerLongueur(){
        List listerLongueur = new ArrayList();
        listerLongueur = longueurDao.findAll();
        return listerLongueur;
    }

    public void ajouterLongueur(Longueur longueur){
         longueurDao.save(longueur);
    }
}
