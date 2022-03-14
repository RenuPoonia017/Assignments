package com.dispatchers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.EmpNotFoundException;
import com.assessment.EmployeeApp;

@WebServlet(name = "EmployeeById", urlPatterns = { "/findEmployeeById" })
public class EmployeeById extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		EmployeeApp e=new EmployeeApp();
		try {
		    String Response=e.findEmployeeById(Integer.parseInt(request.getParameter("id")));
		    out.write(Response);
		}catch(EmpNotFoundException ex) {
			response.sendError(404);
		}
	}

}
