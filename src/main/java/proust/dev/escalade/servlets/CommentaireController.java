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
import proust.dev.escalade.hibernate.entities.Commentaire;
import proust.dev.escalade.hibernate.entities.Utilisateur;
import proust.dev.escalade.services.interfaces.CommentaireService;

import java.util.List;


@Controller
public class CommentaireController {
    @Autowired
    CommentaireService commentaireService;

    @GetMapping("/add-commentaire/{spotId}")
    public ModelAndView ajouterCommentaire(Model model, @PathVariable Integer spotId){
        model.addAttribute("spotId", spotId);
        model.addAttribute("commentaire", new Commentaire());
        return new ModelAndView("add-commentaire");
    }

    @PostMapping(value = "/add-commentaire/{spotId}")
    public ModelAndView ajouterCommentairePost(Model model, @ModelAttribute("commentaire") Commentaire commentaire, @PathVariable Integer spotId) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        commentaire.setUtilisateur((Utilisateur) auth.getPrincipal());
        commentaireService.ajouterCommentaire(spotId,commentaire);
        return new ModelAndView("add-commentaire");
    }

    @GetMapping("/supprimer-commentaire/{comId}")
    public ModelAndView supprimerCommentaire(Model model,@PathVariable Integer comId){
        commentaireService.supprimerCommentaire(comId);
        return new ModelAndView("suppression-commentaire");
    }

    @GetMapping("/modifier-commentaire/{comId}")
    public ModelAndView modifierCommentaire(Model model,@PathVariable Integer comId){
        Commentaire commentaire = new Commentaire();
        model.addAttribute("commentaire",commentaire);
        return new ModelAndView("modifier-commentaire");
    }
    @PostMapping(value = "/modifier-commentaire/{comId}" )
    public ModelAndView modifierCommentairePost(Model model,@ModelAttribute("commentaire") Commentaire commentaire,@PathVariable Integer comId){
        Commentaire commentaireExistant = commentaireService.voirCommentaireById(comId);
        commentaireExistant.setDescription(commentaire.getDescription());
        commentaireService.modifierCommentaire(commentaireExistant);
        return new ModelAndView("home");
    }

    @GetMapping("/les-commentaires")
    public ModelAndView lesCommentaires(Model model){
        List lesCommentaires = commentaireService.listerTousCommentaires();
        model.addAttribute("lesCommentaires",lesCommentaires);
        return new ModelAndView("les-commentaires");
    }
}
