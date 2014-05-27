package basics.harsha.jdbc;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class JDBCDemoTest {

	@Test
	public void testInsertIntoEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testDynamicInsertIntoEmployee() throws SQLException {
		JDBCDemo jd = new JDBCDemo();
		int result = jd.dynamicInsertIntoEmployee("egeorge", "pass", "Evelyn",
				"George", "1989-05-01", "egeorge@gmail.com", 1, 2, 2);
		
		assertEquals(1,result);
	}

	@Test
	public void testSelectFromEmployee() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertIntoDepartment() throws SQLException {
		JDBCDemo jd = new JDBCDemo();
		int result = jd.insertIntoDepartment();
		assertEquals(1,result);
	}

	@Test
	public void testSelectFromDepartment() throws SQLException {
		JDBCDemo jd = new JDBCDemo();
		int result = jd.selectFromDepartment();

		assertEquals(4,result);
	}

	@Test
	public void testInsertIntoDesignation() throws SQLException {
		JDBCDemo jd = new JDBCDemo();
		int result = jd.insertIntoDesignation();

		assertEquals(1,result);
	}

	@Test
	public void testGetCountOfEmployeesFromDepartment() throws SQLException {
		JDBCDemo jd = new JDBCDemo();
		int result = jd.getCountOfEmployeesFromDepartment("production");
		assertEquals(1,result);
	}

}
