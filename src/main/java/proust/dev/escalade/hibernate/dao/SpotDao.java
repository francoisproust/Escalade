package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotDao extends JpaRepository<Spot,Integer> {
    Spot findBySpotId(Integer spotId);
}
