package apex.demo_hib;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UserDao {

	public void insertRecord(Usr u1) {
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Usr.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(u1);
        tx.commit();
        System.out.println(u1);
		
	}

}
