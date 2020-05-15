package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.UtilisateurDao;
import proust.dev.escalade.hibernate.entities.TypeUser;
import proust.dev.escalade.hibernate.entities.Utilisateur;
import proust.dev.escalade.services.interfaces.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {
    @Autowired
    UtilisateurDao utilisateurDao;

    public List listerUtilisateur(){
        List listerUtilisateur = new ArrayList();
        listerUtilisateur = (List) utilisateurDao.findAll();
        return listerUtilisateur ;
    }

    @Override
    public void ajouterUtilisateur(Utilisateur utilisateur) {
        TypeUser typeUser = new TypeUser();
        typeUser.setTypeId(1);
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        utilisateur.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
        utilisateur.setTypeUser(typeUser);
        utilisateurDao.save(utilisateur);
    }

    public void findUtilisateurByPseudo(Utilisateur utilisateur){
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Utilisateur utilisateur = chercherUtilisateurParPseudo(s);
        if (utilisateur == null){
            throw new UsernameNotFoundException(s + "non trouvé");
        }
        return utilisateur;
    }

    private Utilisateur chercherUtilisateurParPseudo(String pseudo){
        Optional<Utilisateur>  utilisateur= utilisateurDao.findUtilisateurByPseudo(pseudo);
        return utilisateur.isPresent() ? utilisateur.get() : null;
    }
}
