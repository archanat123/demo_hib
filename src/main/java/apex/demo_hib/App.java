package apex.demo_hib;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Usr u1 =new Usr();
        Address addr= new Address();
        
        addr.setCity("sunnyvale");
        addr.setState("CA");
        addr.setCountry("US");
        
        
        u1.setUserid(100);
        u1.setFirstname("archana");
        u1.setLastname("thati");
        u1.setMiddlename("palli");
        u1.setAddr(addr);
      
      
      
      UserDao dao=new UserDao();
      dao.insertRecord(u1);
      
      
      
      /*  
        Configuration con = new Configuration().configure().addAnnotatedClass(Usr.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(u1);
       // u1=session.get(Usr.class,2);
        tx.commit();
       // System.out.println(u1); */
    }
}
