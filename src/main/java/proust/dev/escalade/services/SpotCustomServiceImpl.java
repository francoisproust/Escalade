package proust.dev.escalade.services;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.entities.*;
import proust.dev.escalade.services.interfaces.SpotCustomService;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class SpotCustomServiceImpl implements SpotCustomService {
    private EntityManager em;


    public SpotCustomServiceImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public List<Spot> multiCriteriaSpotSearch(SpotFormCriterias criterias) {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Spot> query = builder.createQuery(Spot.class);

        Root<Spot> spotRoot = query.from(Spot.class);
        List<Predicate> predicates = new ArrayList<>();

        if (!criterias.getLocalisation().equals("")) {
            predicates.add(builder.equal(spotRoot. get("localisation"), criterias.getLocalisation()));
        }

        if (!criterias.getCotationMin().equals("")) {
            predicates.add(builder.greaterThanOrEqualTo(spotRoot.join("secteurs").join("voie").join("longueurs").join("cotation").get("indice"), criterias.getCotationMin()));
        }

        if (!criterias.getCotationMax().equals("")) {
            predicates.add(builder.lessThanOrEqualTo(spotRoot.join("secteurs").join("voie").join("longueurs").join("cotation").get("indice"), criterias.getCotationMax()));
        }

        if (!criterias.getLongueurMin().equals("")) {
            predicates.add(builder.greaterThanOrEqualTo(spotRoot.join("secteurs").join("voie").join("longueurs").get("tailleLongueur"), criterias.getLongueurMin()));
        }
        if (!criterias.getLongueurMax().equals("")) {
            predicates.add(builder.lessThanOrEqualTo(spotRoot.join("secteurs").join("voie").join("longueurs").get("tailleLongueur"), criterias.getLongueurMax()));
        }

        if (criterias.getMultiSecteurs()) {
            predicates.add(builder.gt(builder.size(spotRoot.get("secteurs")), 1));
        }

        query.where(predicates.toArray(new Predicate[0]));
/**
        java.util.function.Predicate<Spot> localisation = spot -> spot.getLocalisation().equals(criterias.getLocalisation());
        java.util.function.Predicate<Spot> cotationMin = spot -> spot.getSecteurs().stream().filter(Secteur::getVoie).filter(Voie::getLongueurs).filter().filter(Longueur::getCotation.filter())));

        java.util.function.Predicate<Cotation> totoMin = cotation -> cotation.getIndice().equals(criterias.getCotationMin());
        java.util.function.Predicate<Cotation> longueurs = longueur -> cotation.getIndice().equals(criterias.getCotationMin());

        List<Spot> spots = null;
        spots.stream().filter(localisation.and(cotationMin).and(longueurs).and(cotationMax))
**/
        return em.createQuery(query.distinct(true)).getResultList();
    }

}
