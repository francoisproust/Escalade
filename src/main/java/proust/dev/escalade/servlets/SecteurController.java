package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.entities.Secteur;

import proust.dev.escalade.hibernate.entities.Spot;
import proust.dev.escalade.services.interfaces.CommentaireService;
import proust.dev.escalade.services.interfaces.SecteurService;
import proust.dev.escalade.services.interfaces.SpotService;

import java.util.List;

@Controller
public class SecteurController {
    @Autowired
    SecteurService secteurService;
    @Autowired
    CommentaireService commentaireService;

    @GetMapping("/secteur")
    public ModelAndView listerSecteur(Model model){
        List listerSecteur = secteurService.listerSecteur();
        return new ModelAndView("secteur","listerSecteur",listerSecteur);
    }
    @GetMapping("/voir-secteur/{spotId}")
    public ModelAndView voirSecteurParSpotId(Model model,@PathVariable Integer spotId){
        List voirSecteur = secteurService.voirSecteur(spotId);
        List commentaire = commentaireService.voirCommentaire(spotId);
        model.addAttribute("commentaire",commentaire);
        return new ModelAndView("voir-secteur","voirSecteur",voirSecteur);
    }

    @GetMapping("/add-secteur/{spotId}")
    public ModelAndView ajouterSecteur(Model model,@PathVariable Integer spotId){
        model.addAttribute("spotId", spotId);
        model.addAttribute("secteur", new Secteur());
        return new ModelAndView("add-secteur");
    }

    @PostMapping(value = "/add-secteur/{spotId}")
    public ModelAndView ajouterSecteurPost(Model model, @ModelAttribute("secteur") Secteur secteur,@PathVariable Integer spotId) {
        secteurService.ajouterSecteur(secteur, spotId);
        return voirSecteurParSpotId(null,spotId);
    }
}
