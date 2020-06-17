package proust.dev.escalade.servlets;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.entities.Utilisateur;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public ModelAndView home(Model model) {
        return new ModelAndView("home" );
    }
}
