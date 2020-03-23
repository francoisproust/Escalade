package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Spot;

import java.util.List;

public interface SpotService {
 abstract List listerSpot();
 abstract void ajouterSpot(Spot spot);
}
