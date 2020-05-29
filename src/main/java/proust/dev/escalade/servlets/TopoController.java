package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.entities.Topo;
import proust.dev.escalade.hibernate.entities.Utilisateur;
import proust.dev.escalade.services.interfaces.TopoService;

import java.util.List;
import java.util.Optional;

@Controller
public class TopoController {
    @Autowired
    private TopoService topoService;

    @GetMapping("/topo")
    public ModelAndView listerTopo(Model model){
        List listerTopo = topoService.listerTopo();
        return new ModelAndView("topo","listerTopo",listerTopo);
    }

    @GetMapping("/add-topo")
    public ModelAndView ajouterTopo(Model model){
        model.addAttribute("topo", new Topo());
        return new ModelAndView("add-topo");
    }

    @PostMapping(value = "/add-topo")
    public ModelAndView ajouterTopoPost(Model model, @ModelAttribute("topo") Topo topo){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        topo.setUtilisateur((Utilisateur) auth.getPrincipal());
        topo.setDisponibilite("disponible");
        topoService.ajouterTopo(topo);
        return listerTopo(null);
    }

    @GetMapping("/reserver-topo/{topoId}")
    public ModelAndView reserverTopo(Model model, @PathVariable Integer topoId){
        Topo reserverTopo = topoService.chercherTopo(topoId);
        topoService.topoPreReservation(reserverTopo);
        return listerTopo(null);
    }

}
