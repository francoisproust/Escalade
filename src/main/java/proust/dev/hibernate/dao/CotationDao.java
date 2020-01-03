package proust.dev.hibernate.dao;

import proust.dev.hibernate.entities.Cotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotationDao extends JpaRepository<Cotation,Integer> {
}
