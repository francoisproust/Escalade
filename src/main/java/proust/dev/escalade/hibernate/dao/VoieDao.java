package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Voie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoieDao extends JpaRepository<Voie,Integer> {
}
