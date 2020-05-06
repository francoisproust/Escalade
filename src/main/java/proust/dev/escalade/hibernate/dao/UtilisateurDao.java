package proust.dev.escalade.hibernate.dao;

import proust.dev.escalade.hibernate.entities.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur,Integer> {
    Utilisateur findByUserId(int id);
    Utilisateur findByPseudo(String pseudo);
    Optional<Utilisateur> findUtilisateurByPseudo(String pseudo);
}
