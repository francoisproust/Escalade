package proust.dev.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtils {
    private static StandardServiceRegistry registry;
    private static SessionFactory sessionFactory;
    /*
        private static final SessionFactory sessionFactory = buildSessionFactory();

        // Hibernate 5:
        private static SessionFactory buildSessionFactory() {
            try {
                // Create the ServiceRegistry from proust.dev.hibernate.cfg.xml
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()//
                        .configure("proust.dev.hibernate.cfg.xml").build();

                // Create a metadata sources using the specified service registry.
                Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();

                return metadata.getSessionFactoryBuilder().build();
            } catch (Throwable ex) {

                System.err.println("Initial SessionFactory creation failed." + ex);
                throw new ExceptionInInitializerError(ex);
            }
        }
    */
public static SessionFactory getSessionFactory() {
    if (sessionFactory == null) {
        try {
            // Create registry
            registry = new StandardServiceRegistryBuilder().configure().build();

            // Create MetadataSources
            MetadataSources sources = new MetadataSources(registry);

            // Create Metadata
            Metadata metadata = sources.getMetadataBuilder().build();

            // Create SessionFactory
            sessionFactory = metadata.getSessionFactoryBuilder().build();

        } catch (Exception e) {
            e.printStackTrace();
            if (registry != null) {
                StandardServiceRegistryBuilder.destroy(registry);
            }
        }
    }
    return sessionFactory;
}
/*
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        // Close caches and connection pools
        getSessionFactory().close();
    }

 */
}
