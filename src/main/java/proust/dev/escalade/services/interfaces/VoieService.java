package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Voie;

import java.util.List;

public interface VoieService {
    List listerVoie();

    List voirVoie(Integer secteurId);

    void ajouterVoie(Voie voie,Integer secteurId);
}
