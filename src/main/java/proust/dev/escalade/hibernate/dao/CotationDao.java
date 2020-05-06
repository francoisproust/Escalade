package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Cotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CotationDao extends JpaRepository<Cotation,Integer> {
    List<Cotation> findAll();
}

