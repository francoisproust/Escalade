package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Spot;

import java.util.List;
import java.util.Optional;

public interface SpotService {
 List listerSpot();
 Optional<Spot> trouverSpot (Integer spotId);
 void ajouterSpot(Spot spot);

}
