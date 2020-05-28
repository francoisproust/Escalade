package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.TopoDao;
import proust.dev.escalade.hibernate.entities.Topo;
import proust.dev.escalade.services.interfaces.TopoService;

import java.util.ArrayList;
import java.util.List;

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


}
