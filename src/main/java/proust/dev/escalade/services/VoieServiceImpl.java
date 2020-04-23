package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import proust.dev.escalade.hibernate.dao.VoieDao;
import proust.dev.escalade.services.interfaces.VoieService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VoieServiceImpl implements VoieService {
    @Autowired
    VoieDao voieDao;

    public List listerVoie(){
        List listerVoie = new ArrayList();
        listerVoie = voieDao.findAll();
        return listerVoie;
    }
}
