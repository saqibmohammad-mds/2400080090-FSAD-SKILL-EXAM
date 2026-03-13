import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(OrderData.class)
                .buildSessionFactory();

        Session session = sf.openSession();

        // ADD OPERATION
        Transaction tx = session.beginTransaction();

        OrderData o1 = new OrderData(101, "Ali", "2026-03-13", "Delivered");
        session.persist(o1);

        tx.commit();

        // GET OPERATION
        OrderData obj = session.get(OrderData.class, 101);

        System.out.println("Order ID: " + obj.getOrderId());
        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getDate());
        System.out.println("Status: " + obj.getStatus());

        session.close();
        sf.close();
    }
}
