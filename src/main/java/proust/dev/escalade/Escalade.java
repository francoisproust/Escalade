package proust.dev.escalade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import proust.dev.util.HibernateUtils;
import java.sql.SQLException;

@SpringBootApplication(scanBasePackages = "proust.dev")
@EnableJpaRepositories(basePackages = "proust.dev.hibernate.dao")
@EntityScan(basePackages = "proust.dev.hibernate.entities")
@EnableSwagger2
public class Escalade {
    public static void main(String[] args) throws SQLException {
        HibernateUtils.getSessionFactory().openSession();
        System.out.println("tout va bien!!!!!!");
        SpringApplication.run(Escalade.class,args);
        System.out.println("SPRING OKKKKKKKKKKKKKKKKKKKKKKKKKKK");
    }
}
