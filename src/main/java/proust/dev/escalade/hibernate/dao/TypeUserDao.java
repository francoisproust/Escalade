package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.TypeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeUserDao extends JpaRepository<TypeUser,Integer> {
    List<TypeUser> findAll();
    TypeUser findTypeUserByTypeId(Integer typeId);
}
