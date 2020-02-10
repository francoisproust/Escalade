package proust.dev.hibernate.dao;

import proust.dev.hibernate.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer> {
    Utilisateur findByUserId(int id);
}
