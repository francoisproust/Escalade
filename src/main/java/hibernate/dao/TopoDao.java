package hibernate.dao;

import hibernate.entities.Topo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopoDao extends JpaRepository<Topo,Integer> {
}
