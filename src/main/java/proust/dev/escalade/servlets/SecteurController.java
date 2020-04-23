package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.entities.Secteur;

import proust.dev.escalade.services.interfaces.SecteurService;

import java.util.List;

@Controller
public class SecteurController {
    @Autowired
    SecteurService secteurService;

    @GetMapping("/secteur")
    public ModelAndView listerSecteur(Model model){
        List listerSecteur = secteurService.listerSecteur();
        return new ModelAndView("secteur","listerSecteur",listerSecteur);
    }
    @GetMapping("/voir-secteur")
    public ModelAndView voirSecteur(Model model,Integer spotId){
        //Integer spotId = null;
        List voirSecteur = secteurService.voirSecteur(spotId);
        return new ModelAndView("voir-secteur","voirSecteur",voirSecteur);
    }


    @GetMapping("/add-secteur")
    public ModelAndView ajouterSecteur(Model model){
        model.addAttribute("secteur", new Secteur());
        return new ModelAndView("add-secteur");
    }
}
