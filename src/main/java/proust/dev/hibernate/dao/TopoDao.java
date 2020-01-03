package proust.dev.hibernate.dao;

import proust.dev.hibernate.entities.Topo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopoDao extends JpaRepository<Topo,Integer> {
}
