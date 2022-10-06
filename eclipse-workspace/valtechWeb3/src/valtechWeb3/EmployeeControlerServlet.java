package valtechWeb3;

import java.io.IOException;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.valtech.dao.Employee;
import com.valtech.dao.EmployeeDAO;

@WebServlet(urlPatterns = {"/empCtlr"})
public class EmployeeControlerServlet extends HttpServlet {
	
	private EmployeeDAO dao;
	@Override
	public void init() throws ServletException {
		dao = new EmployeeDAO();
	}
	
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String submit = req.getParameter("submit");
	try {
		if("New Employee".equals(submit)) {
			req.getRequestDispatcher("createEmp.jsp").forward(req, resp);
			return;
		}
		if("Save".equals(submit)) {
			Employee e = new Employee();
			e.setId(dao.getNextValidId());
			e.setName(req.getParameter("name"));
			e.setAge(Integer.parseInt(req.getParameter("age")));
			e.setGender(Integer.parseInt(req.getParameter("gender")));
			e.setSalary(Integer.parseInt(req.getParameter("salary")));
			dao.saveEmployee(e);
	} 

		if("update Employee".equals(submit)) {
			req.getRequestDispatcher("updateEmp.jsp").forward(req, resp);
			return;
		}
		if("Update".equals(submit)) {
			Employee e = new Employee();
			e.setId(Integer.parseInt(req.getParameter("id")));
			e.setName(req.getParameter("name"));
			e.setAge(Integer.parseInt(req.getParameter("age")));
			e.setGender(Integer.parseInt(req.getParameter("gender")));
			e.setSalary(Integer.parseInt(req.getParameter("salary")));
			dao.updateEmployee(e);
	} 
	req.setAttribute("Emps", dao.getEmployee());
	req.getRequestDispatcher("Emps.jsp").forward(req, resp);
}catch  (Exception ex) {
	throw new RuntimeException(ex);
}
	
}
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
//	int id = Integer.parseInt(req.getParameter("empId"));
	try {
        String empId= req.getParameter("empId");
        String submit = req.getParameter("submit");
        if(empId==null){
        	List<Employee> emps=dao.getEmployee();
            req.setAttribute("Emps", emps);
            req.getRequestDispatcher("Emps.jsp").forward(req, resp);
            return;
                                        
    }
        int id= Integer.parseInt(req.getParameter("empId"));
        if("delete".equals(submit)) {
        	dao.deleteEmployee(id);
        	List<Employee> emps=dao.getEmployee();
            req.setAttribute("Emps", emps);
            req.getRequestDispatcher("Emps.jsp").forward(req, resp);
            return;
        	
        }
        Employee e= dao.getEmployeeById(id);
        req.setAttribute("e", e);
        req.getRequestDispatcher("Emp.jsp").forward(req, resp);;
    }catch (Exception ex) {
        throw new RuntimeException(ex);
    }
	
}
}
