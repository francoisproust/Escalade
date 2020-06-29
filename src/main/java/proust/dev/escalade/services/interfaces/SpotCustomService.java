package proust.dev.escalade.services.interfaces;

import proust.dev.escalade.hibernate.entities.Spot;
import proust.dev.escalade.services.SpotFormCriterias;

import java.util.List;

public interface SpotCustomService {
    List<Spot> multiCriteriaSpotSearch(SpotFormCriterias criterias);
}
