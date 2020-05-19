package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer> {
    Optional<Utilisateur> findUtilisateurByPseudo(String pseudo);
}
