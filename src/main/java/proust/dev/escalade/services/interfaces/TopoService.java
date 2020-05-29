package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Topo;

import java.util.List;
import java.util.Optional;

public interface TopoService {
    List listerTopo();
    void ajouterTopo(Topo topo);
    Topo chercherTopo(Integer topoId);
    void topoPreReservation(Topo topo);
}
