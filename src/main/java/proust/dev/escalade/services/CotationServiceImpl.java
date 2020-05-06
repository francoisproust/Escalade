package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.CotationDao;
import proust.dev.escalade.hibernate.entities.Cotation;
import proust.dev.escalade.services.interfaces.CotationService;

import java.util.ArrayList;
import java.util.List;

@Service
public class CotationServiceImpl implements CotationService {
    @Autowired
    CotationDao cotationDao;

    @Override
    public List listerCotation() {
        List<Cotation> listerCotation = new ArrayList();
        Cotation defaultCotation = new Cotation();
        defaultCotation.setIndice("defaut");
        listerCotation.add(defaultCotation);
        listerCotation.addAll(cotationDao.findAll());
        return listerCotation;
    }
}
