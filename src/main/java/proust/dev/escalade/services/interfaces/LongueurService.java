package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Longueur;

import java.util.List;

public interface LongueurService {
    List listerLongueur();
    void ajouterLongueur(Longueur longueur, Integer voieId);
    List voirLongueur(Integer voieId);
    Longueur voirLongueurParId(Integer longueurId);
}

