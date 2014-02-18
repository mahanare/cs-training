package in.careerscale.training.hibernate.model;

// Generated 17 Feb, 2014 8:09:00 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Department generated by hbm2java
 */
@Entity
@Table(name = "department", catalog = "office", uniqueConstraints = @UniqueConstraint(columnNames = "name"))
public class Department implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<Employee> employees = new HashSet<Employee>(0);

	public Department() {
	}

	public Department(String name, Set<Employee> employees) {
		this.name = name;
		this.employees = employees;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", unique = true, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

}
