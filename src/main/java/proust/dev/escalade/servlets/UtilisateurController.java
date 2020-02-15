package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.dao.*;


@Controller
public class UtilisateurController {
    @Autowired
    private UtilisateurDao utilisateurDao;

    @GetMapping(value = "/Utilisateur")
    public ModelAndView loginGet(Model model) {

        return new ModelAndView("Utilisateur");
    }
}
