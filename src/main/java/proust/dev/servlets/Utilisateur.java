package proust.dev.servlets;

import org.springframework.beans.factory.annotation.Autowired;
import proust.dev.hibernate.dao.*;
import proust.dev.util.HibernateUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class Utilisateur extends HttpServlet {
    @Autowired
    private UtilisateurDao utilisateurDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //HibernateUtils.getSessionFactory().openSession();
        Object monUtilisateur = utilisateurDao.findById(4);
        String mavariable = "toto";
        req.setAttribute("monUtilisateur",monUtilisateur);
        this.getServletContext().getRequestDispatcher("/WEB-INF/Utilisateur.jsp").forward(req,resp);
    }
}
