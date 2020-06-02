package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.entities.Utilisateur;
import proust.dev.escalade.services.interfaces.TopoService;
import proust.dev.escalade.services.interfaces.UtilisateurService;

import java.util.List;

@Controller
public class MyProfileController {
    @Autowired
    private UtilisateurService utilisateurService;
    @Autowired
    private TopoService topoService;

    @GetMapping("/mon-profil")
    public ModelAndView monprofil(Model model){
        Authentication utilisateur = SecurityContextHolder.getContext().getAuthentication();
        List listeTopo = topoService.listerTopoParUtilisateur((Utilisateur) utilisateur.getPrincipal());
        model.addAttribute("utilisateur",(Utilisateur) utilisateur.getPrincipal());
        model.addAttribute("topos",listeTopo);
        return new ModelAndView("mon-profil");
    }
}
