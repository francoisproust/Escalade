package proust.dev.hibernate.dao;

import proust.dev.hibernate.entities.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotDao extends JpaRepository<Spot,Integer> {
}
