package in.careerscale.training.hibernate;

import in.careerscale.training.hibernate.model.Department;
import in.careerscale.training.hibernate.model.Designation;
import in.careerscale.training.hibernate.model.Employee;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;





/**
 * ORM -> Object Relational Mapping.
 * 
 * @author harinath
 * 
 */
public class DepartmentDAO {
	
	private  SessionFactory factory;

	public void setFactory(SessionFactory factory){
		this.factory=factory;
	}
	
	public void insertEmployee(Employee employee){
		Session session = factory.openSession();		
		Employee emp = (Employee) session.get(Employee.class, 1); //to fetch/get empoyee.
		System.out.println(emp);
	//System.out.println(emp.getEmailId());
		System.out.println(emp.getFirstName());
		Designation desgination = (Designation) session.get(Designation.class,
				1);

		employee.setDesignation(desgination);
		session.beginTransaction();
		session.save(employee); //to insert employee
		
		session.update(employee); //to update employee 
		System.out.println("new employee id is :" + employee.getId());
		
		
		
		session.getTransaction().commit();
		//session.getTransaction().rollback();

		
	}
	
	
	/*   Insert  designation*/
	
	public void insertDept(Department department)
	
	{
		
		Session session = factory.openSession();		
		Department dept = (Department) session.get(Department.class, 1); //to fetch/get empoyee.
		
		System.out.println("In dept");
		System.out.println(dept);
	//System.out.println(emp.getEmailId());
		System.out.println(dept.getName());
	//	Designation desgination = (Designation) session.get(Designation.class,
			//	1);

	//	employee.setDesignation(desgination);
		session.beginTransaction();
		session.save(department); //to insert employee
		
		session.update(department); //to update employee 
		System.out.println("new department id is :" + department.getId());
		
		
		
		session.getTransaction().commit();
		//session.getTransaction().rollback();
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DepartmentDAO dao = new DepartmentDAO();
		Employee another = new Employee(null, null, null, "wizIQ student",
				"test1", "fristname", "lastName",new Date(), "test@test.com", null);
	//	dao.insertEmployee(another);
		
		Employee emp1 = new Employee(null, null, null, "wizIQ student","test1", "fristname", "lastName",new Date(),"emp1@office.com", null);
		Employee emp2 = new Employee(null, null, null, "wizIQ student","test1", "fristname", "lastName",new Date(),"emp1@office.com", null);
		Employee emp3 = new Employee(null, null, null, "wizIQ student","test1", "fristname", "lastName",new Date(),"emp1@office.com", null);
		
		Set<Employee> employees = new TreeSet<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		System.out.println("in main");
		Department dept = new Department("Sales", employees);
		dao.insertDept(dept);
	}
	
}
