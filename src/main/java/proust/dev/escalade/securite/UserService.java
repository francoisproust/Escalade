package proust.dev.escalade.securite;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import proust.dev.escalade.hibernate.dao.UtilisateurDao;
import proust.dev.escalade.hibernate.entities.Utilisateur;

import java.util.Objects;

@Configuration
public class UserService implements UserDetailsService {
    private final UtilisateurDao userRepository;
    @Autowired
    public UserService(UtilisateurDao userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Objects.requireNonNull(username);
        Utilisateur user = userRepository.findUtilisateurByPseudo(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return user;
    }
}