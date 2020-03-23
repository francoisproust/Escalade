package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.dao.*;
import proust.dev.escalade.hibernate.entities.Utilisateur;
import proust.dev.escalade.services.UtilisateurServiceImpl;
import proust.dev.escalade.services.interfaces.UtilisateurService;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UtilisateurController {
    List listeUtilisateur ;
    @Autowired
    UtilisateurService utilisateurService;

    @GetMapping(value = "/utilisateur")
    public ModelAndView listerUtilisateur(Model model) {
        listeUtilisateur = utilisateurService.listerUtilisateur();
        return new ModelAndView("utilisateur","listeUtilisateur",listeUtilisateur );
    }

    @GetMapping(value = "/creation-compte")
    public ModelAndView creationCompte(Model model) {
        model.addAttribute("utilisateur",new Utilisateur());
        return new ModelAndView("creation-compte");
    }
    @PostMapping(value = "/creation-compte")
    public ModelAndView creationComptePost(Model model, @ModelAttribute("utilisateur") Utilisateur utilisateur) {

        return new ModelAndView("creation-compte" );
    }
}
