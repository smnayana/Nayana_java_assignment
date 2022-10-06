package com.valtech.assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.proxy.annotation.Pre;

public class EmployeeDAO {
    static {
        try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(Exception ex){
            ex.printStackTrace();
            }
        }
    public static final String TABLE_NAME= "employee2";
    
    
    public void deleteEmployee(int id)throws Exception {
    	Connection con = getConnection();
    	PreparedStatement ps = con.prepareStatement("delete from "+TABLE_NAME+" where id= ?");
    	ps.setInt(1, id);
    	ps.executeUpdate();
    	con.close();
    }
   
    
    public List<Employee> getEmployee()throws Exception {
    	Connection con = getConnection();
    	PreparedStatement ps = con.prepareStatement
    			("select id,name,age,gender,salary from "+TABLE_NAME);
    	ResultSet rs = ps.executeQuery();
    	List<Employee> employees = new ArrayList<>();
    	while(rs.next()) {
    		employees.add(employeeFromResultSet(rs));
    	}
    	con.close();
    	return employees;
    }
    
    

    
    Employee getEmployeeById(int id) throws Exception{
        Connection con = getConnection();
        PreparedStatement ps=con.prepareStatement("Select * from employee2 where id=?");
        ps.setInt(1,id);
        ResultSet rs=ps.executeQuery();
        if(rs.next()) {
            Employee e = employeeFromResultSet(rs);
            con.close();
            return e;
            
        } else {
            return null;
        }
    
    }
    
	public List<Employee> getEmployeeByAge(int age) throws Exception {
		Connection con =getConnection();
		PreparedStatement ps = con.prepareStatement("select * from "+TABLE_NAME+" where age=?");
		ps.setInt(1, age);
		ResultSet rs =ps.executeQuery();
		List<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			employees.add(employeeFromResultSet(rs));
		}
			con.close();
			return employees;
	}
	
	public List<Employee> getEmployeeByBetweenAge(int age1,int age2) throws Exception {
		Connection con =getConnection();
		PreparedStatement ps = con.prepareStatement("select * from "+TABLE_NAME+" where age BETWEEN ? AND ?");
		ps.setInt(1, age1);
		ps.setInt(2, age2);
		ResultSet rs =ps.executeQuery();
		List<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			employees.add(employeeFromResultSet(rs));
		}
			con.close();
			return employees;
	}
	
    public List<Employee> getEmployeeGreaterThanSalary(int salary) throws Exception{
    	Connection con = getConnection();
    	PreparedStatement ps = con.prepareStatement("select *from "+TABLE_NAME+" where salary >=?");
    	ps.setInt(1, salary);
    	ResultSet rs =ps.executeQuery();
		List<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			employees.add(employeeFromResultSet(rs));
		}
			con.close();
			return employees;
    }
    
    public List<Employee> getEmployeeLesserThanSalary(int salary) throws Exception{
    	Connection con = getConnection();
    	PreparedStatement ps = con.prepareStatement("select *from "+TABLE_NAME+" where salary <=?");
    	ps.setInt(1, salary);
    	ResultSet rs =ps.executeQuery();
		List<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			employees.add(employeeFromResultSet(rs));
		}
			con.close();
			return employees;
    }

    public List<Employee> getEmployeeByMale(int gender) throws Exception{
    	Connection con = getConnection();
    	PreparedStatement ps = con.prepareStatement("select *from "+TABLE_NAME+" where gender=?");
    	ps.setInt(1, gender);
    	ResultSet rs =ps.executeQuery();
		List<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			employees.add(employeeFromResultSet(rs));
		}
			con.close();
			return employees;
    }
    
    public List<Employee> getEmployeeByFemale(int gender) throws Exception{
    	Connection con = getConnection();
    	PreparedStatement ps = con.prepareStatement("select *from "+TABLE_NAME+" where gender=?");
    	ps.setInt(1, gender);
    	ResultSet rs =ps.executeQuery();
		List<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			employees.add(employeeFromResultSet(rs));
		}
			con.close();
			return employees;
    }

    public List<Employee> getEmployeeByOther(int gender) throws Exception{
   	Connection con = getConnection();
   	PreparedStatement ps = con.prepareStatement("select *from "+TABLE_NAME+" where gender=?");
   	ps.setInt(1, gender);
   	ResultSet rs =ps.executeQuery();
		List<Employee> employees = new ArrayList<>();
		while(rs.next()) {
			employees.add(employeeFromResultSet(rs));
		}
			con.close();
			return employees;
   }

    
	private Employee employeeFromResultSet(ResultSet rs) throws SQLException {
		Employee e = new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setAge(rs.getInt(3));
		e.setGender(rs.getInt(4));
		e.setSalary(rs.getFloat(5));
		return e;
	}

	public void updateEmployee(Employee e) throws Exception {
		Connection con = getConnection();
		PreparedStatement ps = con.prepareStatement("update "+TABLE_NAME+" set name=?,age=?,gender=?,salary=? where id=?");
		
		ps.setString(1, e.getName());
		ps.setInt(2, e.getAge());
		ps.setInt(3, e.getGender());
		ps.setDouble(4, e.getSalary());
		ps.setInt(5, e.getId());
		
		int rowAffected = ps.executeUpdate();
		con.close();
	}

    
	
    public void saveEmployee(Employee e) throws Exception {
    	Connection con = getConnection();
    	PreparedStatement ps = con.prepareStatement("insert into "+TABLE_NAME+" (id,name,age,gender,salary) values (?,?,?,?,?)");
    	
    	
    ps.setInt(1,e.getId());
    ps.setString(2,e.getName());
    ps.setInt(3,e.getAge());
    ps.setInt(4,e.getGender());
    ps.setDouble(5,e.getSalary());
    
    int rowsAffected= ps.executeUpdate();
    con.close();
    }
    
    public int count()throws Exception {
        Connection con=getConnection();
        Statement st = con.createStatement();
        ResultSet rs =st.executeQuery("Select count(id)from "+TABLE_NAME);
        if(rs.next()) {
            int count=rs.getInt(1);
            con.close();
            return count;
            
        }else {
            con.close();
            return -1;
        }
        
    }
        
    public Connection getConnection()throws Exception {
        return DriverManager.getConnection("jdbc:oracle:thin:@192.168.102.38:1521/xe","valtrg27","valtrg27");
        
    }



}