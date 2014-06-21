package in.careerscale.batch4.hibernate;

import java.util.List;

import in.careerscale.batch4.model.Department;
import in.careerscale.batch4.model.Employee;

import org.hibernate.Query;
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
    	employee.setFirstName("hari");
    	employee.setLastName("mallepally");

    	session.beginTransaction();
    	session.save(employee);
    	session.getTransaction().commit();
    	
    	Employee empFromDb =(Employee) session.get(Employee.class, 1);
    	
    	System.out.println(empFromDb.getEmailId() +" " + empFromDb.getFirstName());
    	
    	//Query query = session.createQuery("select d from Department d  inner join Employee e  where  d.id =e.department.id  and e.id=:empId");
    	Query query = session.createQuery("select d from Department d where d.id = :id");
    	query.setInteger("empId", 1);
    	
    	List<Department> departments = query.list();
    	
    	System.out.println(departments.get(0).getDeptName());
    	
    	
    	
	}

}
