package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Secteur;

import java.util.List;

public interface SecteurService {
    List listerSecteur();
    List voirSecteur(Integer spotId);
    void ajouterSecteur(Secteur secteur, Integer spotId);
}
