package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Topo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopoDao extends JpaRepository<Topo,Integer> {
    List findAllByUtilisateur_UserId(Integer userId);
}
