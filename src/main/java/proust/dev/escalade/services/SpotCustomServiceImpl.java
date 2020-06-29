package proust.dev.escalade.services;

import proust.dev.escalade.hibernate.entities.Spot;
import proust.dev.escalade.services.interfaces.SpotCustomService;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

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
            predicates.add(builder.equal(spotRoot.get("localisation"), criterias.getLocalisation()));
        }

        if (!criterias.getCotationMin().equals("")) {
            predicates.add(builder.greaterThanOrEqualTo(spotRoot.join("secteur").join("voie").join("longueur").join("cotation").get("indice"), criterias.getCotationMin()));
        }
        if (!criterias.getCotationMax().equals("")) {
            predicates.add(builder.lessThanOrEqualTo(spotRoot.join("secteur").join("voie").join("longueur").join("cotation").get("indice"), criterias.getCotationMax()));
        }

        if (!criterias.getLongueurMin().equals("")) {
            predicates.add(builder.greaterThanOrEqualTo(spotRoot.join("secteur").join("voie").join("longueur").get("longueur"), criterias.getLongueurMin()));
        }
        if (!criterias.getLongueurMax().equals("")) {
            predicates.add(builder.lessThanOrEqualTo(spotRoot.join("secteur").join("voie").join("longueur").get("longueur"), criterias.getLongueurMax()));
        }

        if (criterias.getMultiSecteurs()) {
            predicates.add(builder.gt(builder.size(spotRoot.get("secteurs")), 1));
        }



        query.where(predicates.toArray(new Predicate[0]));

        return em.createQuery(query.distinct(true)).getResultList();
    }
}
