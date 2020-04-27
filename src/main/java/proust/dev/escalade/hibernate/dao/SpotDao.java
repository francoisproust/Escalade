package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpotDao extends JpaRepository<Spot,Integer> {
    List findAllBySpotId(Integer spotId);
}
