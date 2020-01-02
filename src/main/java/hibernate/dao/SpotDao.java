package hibernate.dao;

import hibernate.entities.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotDao extends JpaRepository<Spot,Integer> {
}
