package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.TypeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeUserDao extends JpaRepository<TypeUser,Integer> {
}
