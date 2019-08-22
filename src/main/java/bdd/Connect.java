package bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Connect {

    public static void main(String[] args) throws SQLException {
       /** try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "francois")) {

            System.out.println("Java JDBC PostgreSQL Example");
            System.out.println("Connected to PostgreSQL database!");
            Statement statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }*/

        Session session;

            Configuration configuration = new Configuration().configure("/hibernate.cfg.xml");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            session = sessionFactory.openSession();
        }
    }
