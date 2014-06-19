package in.careerscale.batch4.hibernate;

import in.careerscale.batch4.model.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.junit.Test;



public class HibernateTest {
	
	@Test
	public void testHibernate()
	{
		Configuration configuration = new Configuration().configure();
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	SessionFactory factory = configuration.buildSessionFactory(builder.build());
    	Session session = factory.openSession();
    	Employee employee = new Employee();
    	/*employee.setEmpName("Senthil Kumar");;
    	employee.setBranch("Pune");
    	session.beginTransaction();
    	session.save(employee);
    	session.getTransaction().commit();*/
    	
    	
	}

}
