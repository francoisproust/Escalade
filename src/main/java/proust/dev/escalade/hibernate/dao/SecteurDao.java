package proust.dev.escalade.hibernate.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import proust.dev.escalade.hibernate.entities.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SecteurDao extends JpaRepository<Secteur,Integer> {
    List findAllBySpot_SpotId(Integer spotId);
    Secteur findBySecteurId(Integer secteurId);
}
