package hibernate.dao;

import hibernate.entities.Cotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CotationDao extends JpaRepository<Cotation,Integer> {
}
