package proust.dev.escalade.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proust.dev.escalade.hibernate.dao.TypeUserDao;
import proust.dev.escalade.services.interfaces.TypeUserService;

import java.util.List;

@Service
public class TypeUserServiceImpl implements TypeUserService {
    @Autowired
    TypeUserDao typeUserDao;

    @Override
    public List listerTypeUser() {
        List listeTypeUser = typeUserDao.findAll();
        return listeTypeUser;
    }
}
