package proust.dev.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import proust.dev.hibernate.dao.*;
import proust.dev.util.HibernateUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet("Utilisateur")
public class Utilisateur extends HttpServlet {
    @Autowired
    private UtilisateurDao utilisateurDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Object monUtilisateur = utilisateurDao.findByUserId(4);
        String mavariable = "toto";
        req.setAttribute("mabase",monUtilisateur);
        req.setAttribute("monUtilisateur",mavariable);
        this.getServletContext().getRequestDispatcher("/WEB-INF/Utilisateur.jsp").forward(req,resp);
    }
}
