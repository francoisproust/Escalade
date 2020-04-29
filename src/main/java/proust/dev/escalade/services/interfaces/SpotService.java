package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Spot;

import java.util.List;
import java.util.Optional;

public interface SpotService {
 List listerSpot();
 void ajouterSpot(Spot spot);
 Spot voirSpot(Integer spotId);
}
