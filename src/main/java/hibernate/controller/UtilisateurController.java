package hibernate.controller;

import hibernate.dao.UtilisateurDao;
import hibernate.entities.Utilisateur;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(description = "Gestion des utilisateurs")
@RestController
public class UtilisateurController {
    @Autowired
    private UtilisateurDao utilisateurDao;
    ///Utilisateurs
    @GetMapping(value = "Utilisateurs")
    public List<Utilisateur> listeUtilisateurs(){
        return utilisateurDao.findAll();
    }
}
