package hibernate.impl;

import hibernate.dao.EntityRepository;
import hibernate.entities.Utilisateur;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UtilisateurDaoImpl implements EntityRepository<Utilisateur> {
    @PersistenceContext
    private EntityManager em;
    @Override
    public Utilisateur save(Utilisateur u) {
        em.persist(u);
        return u;
    }

    @Override
    public List<Utilisateur> findAll() {
        Query req = em.createQuery("select u from Utilisateur u");
        return req.getResultList();
    }

    @Override
    public Utilisateur findOne(Long userId) {
        Utilisateur u = em.find(Utilisateur.class,userId);
        return u;
    }

    @Override
    public Utilisateur update(Utilisateur utilisateur) {
        em.merge(utilisateur);
        return utilisateur;
    }

    @Override
    public List<Utilisateur> findByDesignation(String critere) {
        return null;
    }

    @Override
    public void delete(Long userId) {
        Utilisateur u =em.find(Utilisateur.class,userId);
        em.remove(u);
    }
}
