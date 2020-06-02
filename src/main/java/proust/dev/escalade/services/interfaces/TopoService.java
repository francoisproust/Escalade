package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Topo;
import proust.dev.escalade.hibernate.entities.Utilisateur;

import java.util.List;


public interface TopoService {
    List listerTopo();
    void ajouterTopo(Topo topo);
    Topo chercherTopo(Integer topoId);
    void topoReservation(Topo topo, String statut);
    List listerTopoParUtilisateur(Utilisateur utilisateur);

}
