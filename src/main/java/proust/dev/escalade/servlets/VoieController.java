package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
}
