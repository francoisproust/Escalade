package proust.dev.escalade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import proust.dev.escalade.hibernate.dao.SpotDao;
import proust.dev.escalade.hibernate.dao.UtilisateurDao;


@SpringBootApplication
public class Escalade implements CommandLineRunner {
    //extends SpringBootServletInitializer {
    @Autowired
    private SpotDao sd;
    @Autowired
    private UtilisateurDao ud;

    public static void main(String[] args) {

        SpringApplication.run(Escalade.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        sd.findAll().forEach(x -> System.out.println(x));

        System.out.println(ud.findByPseudo("francois").getEmail());
    }
}