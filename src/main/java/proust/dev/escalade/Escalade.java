package proust.dev.escalade;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class})
@EnableJpaRepositories("proust.dev.hibernate.dao")
public class Escalade extends SpringBootServletInitializer {

    public static void Escalade(String[] args) {
        new Escalade().runAsJavaApplication(args);
    }

    private void runAsJavaApplication(String[] args) {
        SpringApplicationBuilder application = new SpringApplicationBuilder();
        application.sources(Escalade.class);
        application.run(args);
    }
}
