package proust.dev.escalade;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import java.sql.SQLException;

@SpringBootApplication
public class Escalade extends SpringBootServletInitializer {

    public static void main(String[] args) throws SQLException {
        //new Escalade().runAsJavaApplication(args);
        //HibernateUtils.getSessionFactory().openSession();
        SpringApplicationBuilder application = new SpringApplicationBuilder();
        application.sources(Escalade.class);
        application.run(args);
        System.out.println("tout va bien!!!!!!");
    }
}
