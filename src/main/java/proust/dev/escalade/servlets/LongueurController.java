package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.entities.Cotation;
import proust.dev.escalade.hibernate.entities.Longueur;
import proust.dev.escalade.services.interfaces.CotationService;
import proust.dev.escalade.services.interfaces.LongueurService;
import java.util.List;

@Controller
public class LongueurController {
    List listeLongueur;
    @Autowired
    LongueurService longueurService;
    @Autowired
    CotationService cotationService;


    @GetMapping("/longueur")
    public ModelAndView listerLongueur(Model model){
        listeLongueur = longueurService.listerLongueur();
        return new ModelAndView("longueur","listeLongueur",listeLongueur);
    }

    @GetMapping("voir-longueur/{voieId}")
    public  ModelAndView voirLongueur(Model model,@PathVariable Integer voieId){
        List voirLongueur = longueurService.voirLongueur(voieId);
        return  new ModelAndView("voir-longueur","voir-longueur",voirLongueur);
    }

    @GetMapping("/add-longueur/{voieId}")
    public ModelAndView ajouterLongueur(Model model, @PathVariable Integer voieId){
        List listCotation = cotationService.listerCotation();
        model.addAttribute("voieId", voieId);
        model.addAttribute("listCotation",listCotation);
        model.addAttribute("longueur", new Longueur());
        return new ModelAndView("add-longueur");
    }

    @PostMapping(value = "/add-longueur/{voieId}")
    public ModelAndView ajouterLongueurPost(Model model, @ModelAttribute("longueur") Longueur longueur, @PathVariable Integer voieId) {
        longueurService.ajouterLongueur(longueur, voieId);
        return voirLongueur(null,voieId);
    }

}
