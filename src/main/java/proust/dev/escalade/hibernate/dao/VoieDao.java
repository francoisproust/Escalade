package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Voie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoieDao extends JpaRepository<Voie,Integer> {
    List findAllBySecteur_SecteurId(Integer secteurId);
    Voie findByVoieId(Integer voieId);
}
