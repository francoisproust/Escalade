package hibernate.dao;

import hibernate.entities.Longueur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LongueurDao extends JpaRepository<Longueur, Integer> {
}
