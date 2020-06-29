package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.services.SpotFormCriterias;
import proust.dev.escalade.services.interfaces.CotationService;
import proust.dev.escalade.services.interfaces.SpotCustomService;

import java.util.List;

@Controller
public class RechercheController {
    SpotCustomService spotCustomService;
    @Autowired
    CotationService cotationService;

    @GetMapping("/rechercher-spot")
    public ModelAndView recherche(Model model){
        SpotFormCriterias spotFormCriterias = new SpotFormCriterias();
        List listCotation =  cotationService.listerCotation();
        model.addAttribute("spotFormCriterias",spotFormCriterias);
        model.addAttribute("listCotation",listCotation);
        return new ModelAndView("rechercher-spot");
    }

    @PostMapping(value = "/rechercher-spot")
    public ModelAndView recherchePost(Model model, @ModelAttribute("spotFormCriterias") SpotFormCriterias spotFormCriterias){
        spotCustomService.multiCriteriaSpotSearch(spotFormCriterias);
        return new ModelAndView("resultat","spotFormCriterias",spotFormCriterias);
    }

    @GetMapping("resultat")
    public ModelAndView resultat(Model model, @ModelAttribute("spotFormCriterias") SpotFormCriterias spotFormCriterias){
        return new ModelAndView("resultat");
    }


}