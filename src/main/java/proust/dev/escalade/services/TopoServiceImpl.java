package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.TopoDao;
import proust.dev.escalade.hibernate.entities.Topo;
import proust.dev.escalade.hibernate.entities.Utilisateur;
import proust.dev.escalade.services.interfaces.TopoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopoServiceImpl implements TopoService {
    @Autowired
    TopoDao topoDao;

    @Override
    public List listerTopo() {
        List listerTopo = new ArrayList();
        listerTopo = topoDao.findAll();
        return listerTopo;
    }

    @Override
    public void ajouterTopo(Topo topo) {
        topoDao.save(topo);
    }

    @Override
    public Topo chercherTopo(Integer topoId) {
        Optional<Topo> topo = topoDao.findById(topoId);
        return topo.isPresent() ? topo.get() : null;
    }

    @Override
    public void topoReservation(Topo topo) {
        if (topo.getDisponibilite().equals("En attente")){
            topo.setDisponibilite("Réservé");
        }else
            topo.setDisponibilite("En attente");
        topoDao.save(topo);
    }

    @Override
    public List listerTopoParUtilisateur(Utilisateur utilisateur) {
        List mesTopos = topoDao.findAllByUtilisateur_UserId(utilisateur.getUserId());
        return mesTopos;
    }
}
