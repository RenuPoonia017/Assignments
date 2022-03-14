package com.dispatchers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.EmpExistsException;
import com.assessment.Employee;
import com.assessment.EmployeeApp;
@WebServlet("/deleteEmployee")
public class DeleteEmployee extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	       resp.setContentType("text/html");
	       PrintWriter out=resp.getWriter();
	       
	       String pid=req.getParameter("id");
	       int id=Integer.parseInt(pid);
	       
	       String name=req.getParameter("name");
	       String city=req.getParameter("city");
	       
	       Employee p=new Employee(id,name,city);
	       EmployeeApp app=new EmployeeApp();
	       String res=app.deleteEmployee(id);
	       out.write(res);
	       
	}

}
