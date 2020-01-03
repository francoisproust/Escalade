package proust.dev.hibernate.controller;

import proust.dev.hibernate.dao.UtilisateurDao;
import proust.dev.hibernate.entities.Utilisateur;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Api(description = "Gestion des utilisateurs")
@RestController
public class UtilisateurController {
   @Autowired
   private UtilisateurDao utilisateurDao;

    ///Utilisateurs
    @ApiOperation(value = "Récupère la liste des utilisateurs")
    @GetMapping(value = "Utilisateurs")
    public List<Utilisateur> listeUtilisateurs(){
        //return new ArrayList<>();
        return utilisateurDao.findAll();
    }

    ///Créer utilisateurs
    @ApiOperation(value = "Ajoute un utilisateur")
    @PostMapping(value = "/Utilisateurs")
    public ResponseEntity<Void> ajouterUtilisateur(@RequestBody Utilisateur utilisateur){
        Utilisateur utilisateur1 = utilisateurDao.save(utilisateur);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{userId}")
                .buildAndExpand(utilisateur1.getUserId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

}
