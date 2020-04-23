package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.entities.Longueur;
import proust.dev.escalade.services.interfaces.LongueurService;

import java.util.List;

@Controller
public class LongueurController {
    List listeLongueur;
    @Autowired
    private LongueurService longueurService;

    @GetMapping("/longueur")
    public ModelAndView listerLongueur(Model model){
        listeLongueur = longueurService.listerLongueur();
        return new ModelAndView("longueur","listeLongueur",listeLongueur);
    }
    @GetMapping("/add-longueur")
    public ModelAndView ajouterLongueur(Model model){
        model.addAttribute("longueur", new Longueur());
        return new ModelAndView("add-longueur");
    }

    @PostMapping(value = "/add-longueur")
    public ModelAndView ajouterLongueurPost(Model model, @ModelAttribute("longueur") Longueur longueur) {
        longueurService.ajouterLongueur(longueur);
        return new ModelAndView("add-longueur" );
    }

}
