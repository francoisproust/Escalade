package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface SecteurDao extends JpaRepository<Secteur,Integer> {
    List findBySpotEquals(Integer spotId);
}
