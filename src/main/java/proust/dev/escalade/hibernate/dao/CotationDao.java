package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Cotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotationDao extends JpaRepository<Cotation,Integer> {
}
