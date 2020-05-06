package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Longueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LongueurDao extends JpaRepository<Longueur, Integer> {
    List findAllByVoie_VoieId(Integer voieId);
    Longueur findByLongueurId(Integer longueurId);
}
