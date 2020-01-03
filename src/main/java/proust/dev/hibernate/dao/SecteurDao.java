package proust.dev.hibernate.dao;

import proust.dev.hibernate.entities.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecteurDao extends JpaRepository<Secteur,Integer> {
}
