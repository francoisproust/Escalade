package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import proust.dev.escalade.hibernate.entities.Voie;
import proust.dev.escalade.services.interfaces.VoieService;

import java.util.List;

@Controller
public class VoieController {
    @Autowired
    private VoieService voieService;

    @GetMapping("/voie")
    public ModelAndView listerVoie(Model model){
        List listerVoie = voieService.listerVoie();
        return new ModelAndView("voie","listerVoie",listerVoie);
    }
    @GetMapping("/voir-voie/{secteurId}")
    public ModelAndView voirVoie(Model model, @PathVariable Integer secteurId){
        List voirVoie = voieService.voirVoie(secteurId);
        return new ModelAndView("voir-voie","voirVoie",voirVoie);
    }
    @GetMapping("/add-voie/{secteurId}")
    public ModelAndView ajouterVoie(Model model,@PathVariable Integer secteurId){
        model.addAttribute("secteurId", secteurId);
        model.addAttribute("voie", new Voie());
        return new ModelAndView("add-voie");
    }
    @PostMapping(value = "/add-voie/{secteurId}")
    public ModelAndView ajouterVoiePost(Model model,@ModelAttribute Voie voie,@PathVariable Integer secteurId){
        voieService.ajouterVoie(voie, secteurId);
        return voirVoie(null,secteurId);
    }
}
