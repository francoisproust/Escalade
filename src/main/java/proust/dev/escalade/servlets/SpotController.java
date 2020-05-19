
package proust.dev.escalade.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import proust.dev.escalade.hibernate.entities.Spot;
import proust.dev.escalade.services.interfaces.SpotService;
import java.util.List;

@Controller
public class SpotController {
    @Autowired
    private SpotService spotService;

    @GetMapping("/spot")
    public ModelAndView listerSpot(Model model){
        List listerSpot = spotService.listerSpot();
        return new ModelAndView("spot","listerSpot",listerSpot);
    }
    @GetMapping("/voir-spot/{spotId}")
    public ModelAndView voirSpot(Model model,@PathVariable Integer spotId){
        Spot voirSpot = spotService.voirSpot(spotId);
        model.addAttribute("spotId",spotId);
        model.addAttribute("voirSpot",voirSpot);
        return new ModelAndView("voir-spot");
    }

    @GetMapping("/add-spot")
    public ModelAndView ajouterSpot(Model model){
        model.addAttribute("spot", new Spot());
        return new ModelAndView("add-spot");
    }

    @PostMapping(value = "/add-spot")
    public ModelAndView ajouterSpotPost(Model model, @ModelAttribute("spot") Spot spot) {
        spotService.ajouterSpot(spot);
        return new ModelAndView("add-spot");
    }

}