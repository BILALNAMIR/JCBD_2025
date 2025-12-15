package esport.ex1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml") 
                    .addAnnotatedClass(Atleta.class)
                    .addAnnotatedClass(Esport.class)
                    .buildSessionFactory();
        } catch (Exception e) {
            // IMPORTANT: mostrar l’error real
            System.err.println("Error creant la SessionFactory: " + e);
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
