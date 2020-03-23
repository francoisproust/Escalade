package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Longueur;

import java.util.List;

public interface LongueurService {
    abstract List listerLongueur();
    abstract void ajouterLongueur(Longueur longueur);
}

