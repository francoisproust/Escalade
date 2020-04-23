package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.SpotDao;
import proust.dev.escalade.hibernate.entities.Spot;
import proust.dev.escalade.services.interfaces.SpotService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class SpotServiceImpl implements SpotService {
    @Autowired
    SpotDao spotDao;

    public List listerSpot(){
        List listerSpot = new ArrayList();
        listerSpot = spotDao.findAll();
        return listerSpot;
    }

    @Override
    public Optional<Spot> trouverSpot(Integer spotId) {
        Optional<Spot> spot = Optional.of(new Spot());
        spot = spotDao.findById(spotId);
        return spot;
    }

    public void ajouterSpot(Spot spot){

        spotDao.save(spot);
    }
}
