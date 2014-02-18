package in.careerscale.training.hibernate;

import in.careerscale.training.hibernate.model.Department;
import in.careerscale.training.hibernate.model.Designation;
import in.careerscale.training.hibernate.model.Employee;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
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
public class BaseDAO {
	
	private static SessionFactory factory;
	public SessionFactory getSessionFactory(){
		
		if(factory == null){
			 Configuration configuration = new Configuration();
			    configuration.configure();
			    ServiceRegistry  serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
			    factory = configuration.buildSessionFactory(serviceRegistry);
		}
		return factory;
		
	}
	
	public void insertEmployee(Employee employee){
		Session session = getSessionFactory().openSession();		
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BaseDAO dao = new BaseDAO();
		
		Employee another = new Employee(null, null, null, "wizIQ student",
				"test1", "fristname", "lastName",new Date(), "test@test.com", null);
		dao.insertEmployee(another);
	}
	
	/**
	 * 
	 * 
	  <bean id="sessionFactory"
        class="org.springframework.orm.hibernate3.LocalSessionFactoryBean">
        <property name="dataSource" ref="dataSource"></property>
        <property name="configLocation">
            <value>classpath:hibernate.cfg.xml</value>
        </property>
        <property name="configurationClass">
            <value>org.hibernate.cfg.AnnotationConfiguration</value>
        </property>
        <property name="hibernateProperties">
            <props>
                <prop key="hibernate.dialect">${jdbc.dialect}</prop>
                <prop key="hibernate.show_sql">true</prop>
            </props>
        </property>
    </bean>
	 
	 */
	
	
	/*
	 * 
	 * 
	 * 
	 * 
	 
			<bean id="mySessionFactory" class="org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean">
			<property name="dataSource" ref="myDataSource" />
			<property name="annotatedClasses">
			<list>
			<value>com.vaannila.domain.User</value>
			</list>
			</property>
			<property name="hibernateProperties">
			<props>
			<prop key="hibernate.dialect"> org.hibernate.dialect.HSQLDialect</prop>
			<prop key="hibernate.show_sql">true</prop>
			<prop key="hibernate.hbm2ddl.auto">create</prop>
			</props>
			</property>
			</bean>
				
	 */

}
