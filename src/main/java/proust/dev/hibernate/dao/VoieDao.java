package proust.dev.hibernate.dao;

import proust.dev.hibernate.entities.Voie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoieDao extends JpaRepository<Voie,Integer> {
}
