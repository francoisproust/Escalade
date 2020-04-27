package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.SecteurDao;
import proust.dev.escalade.services.interfaces.SecteurService;

import java.util.ArrayList;
import java.util.List;

@Service
public class SecteurServiceImpl implements SecteurService {
    @Autowired
    SecteurDao secteurDao;

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
}
