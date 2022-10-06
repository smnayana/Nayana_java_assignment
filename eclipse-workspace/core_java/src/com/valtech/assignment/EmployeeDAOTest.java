package com.valtech.assignment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.util.List;

import org.junit.jupiter.api.Test;

public class EmployeeDAOTest {
	
	@Test
	public void testUpdateEmployee() throws Exception {
		EmployeeDAO dao = new EmployeeDAO();
		
		dao.updateEmployee(new Employee(3,"new",25,1,600000));
		Employee e = dao.getEmployeeById(3);
		assertEquals(e.getId(), 3);
//		assertEquals(e.getName(), "new three");
//		assertEquals(25, e.getAge());
//		assertEquals(1,e.getGender());
//		assertEquals(600000, e.getSalary(),0.00000);
//		
	}
	
	
	
	
	@Test
	public void test() throws Exception {
		EmployeeDAO dao =new EmployeeDAO();
		Connection conn=dao.getConnection();
		conn.close();
	}
	
	
	@Test
	public void testGetEmployees() throws Exception {
		EmployeeDAO dao= new EmployeeDAO();
		assertEquals(dao.count(),dao.getEmployee().size());
	}
	
	
	   
	   @Test
	    public void testGetEmployeeById() throws Exception {
	    
	    
	    EmployeeDAO dao =new EmployeeDAO();
	    Employee e=dao.getEmployeeById(1);
	    
	    
	    assertEquals(1, e.getId());
	    assertEquals(23, e.getAge());
//	    assertEquals(1, e.getGender());
//	    assertEquals("abc", e.getName());
	    
	   }
	   
	   @Test
	   public void testgetEmployeeByAge() throws Exception {
		  EmployeeDAO dao= new EmployeeDAO();
		  List<Employee> e = dao.getEmployeeByAge(30);
			assertFalse("nayana", false);
			assertFalse("sindhu", false);
			assertTrue("xyz",true);
			
	   }
	   
	   
	   
	   @Test
	   public void testgetEmployeeByBetweenAge() throws Exception {
		   EmployeeDAO dao = new EmployeeDAO();
		   int total = dao.getEmployeeByBetweenAge(25, 30).size();
		   assertEquals(3, total);
		   assertTrue("abc",true);
		   assertTrue("new",true);
		   assertFalse("nayana",false);
		   
	   }
	   
	   @Test
	   public void testgetEmployeeGreaterThanSalary() throws Exception{
		   EmployeeDAO dao= new EmployeeDAO();
		   //List<Employee> e = dao.getEmployeeGreaterThanSalary(55000);
		   int total = dao.getEmployeeGreaterThanSalary(55000).size();
		   assertEquals(total,10);
		   assertTrue("xyz",true);
		   assertFalse("sindhu",false);
		   
	   }
	   
	   @Test 
	   public void testgetEmployeeLesserThanSalary() throws Exception{
		   EmployeeDAO dao= new EmployeeDAO();
		   List<Employee> e = dao.getEmployeeLesserThanSalary(29000);
		   int total = dao.getEmployeeLesserThanSalary(29000).size();
		   assertEquals(total,e.size());
		   assertTrue("nayana",true);
		   assertTrue("sindhu",true);
		   assertFalse("xyz",false);
	   }
	   
	   @Test
	   public void getEmployeeByMale() throws Exception{
		   EmployeeDAO dao= new EmployeeDAO();
		   List<Employee> e = dao.getEmployeeByMale(1);
		   int total = dao.getEmployeeByMale(1).size();
		   assertEquals(total,7);
		   assertTrue("akshay",true);
		   assertTrue("abc",true);
		   assertFalse("xyz",false);
	   }
	   
	   
	   @Test
	   public void getEmployeeByFemale() throws Exception{
		   EmployeeDAO dao= new EmployeeDAO();
		   List<Employee> e = dao.getEmployeeByFemale(2);
		   int total = dao.getEmployeeByFemale(2).size();
		   assertEquals(total,5);
		   assertTrue("nayana",true);
		   assertTrue("sindhu",true);
		   assertFalse("abc",false);
	   }
	   
	  @Test
	  public void getEmployeeByOther() throws Exception{
		   EmployeeDAO dao= new EmployeeDAO();
		   List<Employee> e = dao.getEmployeeByOther(3);
		   int total = dao.getEmployeeByOther(3).size();
		   assertEquals(total,e.size() );
		   assertTrue("anamika",true);
		   assertTrue("best",true);
		   assertFalse("abc",false);
	   }
	   

//	    
//	@Test
//	 public void testSaveEmployee()throws Exception{
//       EmployeeDAO dao= new EmployeeDAO();
//       int count = dao.count();
//       dao.saveEmployee(new Employee(14,"pest",20,3,14000));
//     
//       
//       assertEquals(count+1, dao.count());
//      
//       
////       
////       dao.deleteEmployee(34);
////       assertEquals(count, dao.count());
//	}
}

