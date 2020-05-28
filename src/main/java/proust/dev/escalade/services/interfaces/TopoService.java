package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Topo;

import java.util.List;

public interface TopoService {
    List listerTopo();
    void ajouterTopo(Topo topo);
}
