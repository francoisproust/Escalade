package escalade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import util.HibernateUtils;
import java.sql.SQLException;

@SpringBootApplication
@EnableSwagger2
public class Escalade {
    public static void main(String[] args) throws SQLException {
        SpringApplication.run(Escalade.class,args);
        System.out.println("SPRING OKKKKKKKKKKKKKKKKKKKKKKKKKKK");
    }
}
