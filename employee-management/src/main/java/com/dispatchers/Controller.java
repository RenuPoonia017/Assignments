package com.dispatchers;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.assessment.EmployeeApp;
@WebServlet("/controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data=request.getParameter("task");
	    switch(data) {
		case "findEmployeeById":
			RequestDispatcher rd=request.getRequestDispatcher("/findEmployeeById");
			rd.forward(request, response);
			break;
		case "createEmployee":
			RequestDispatcher rd1=request.getRequestDispatcher("/createEmployee");
			rd1.forward(request, response);
			break;
		case "update":
			RequestDispatcher rd2=request.getRequestDispatcher("/updateEmployee");
			rd2.forward(request, response);
			break;
		case "delete":
			RequestDispatcher rd3=request.getRequestDispatcher("/deleteEmployee");
			rd3.forward(request, response);
			break;
		case "list":
			EmployeeApp app=new EmployeeApp();
			List<String> list=app.listOfAllEmployees();
			HttpSession session=request.getSession(true);
			session.setAttribute("data",list);
			request.getRequestDispatcher("emplist.jsp").forward(request, response);
		default:
			response.sendError(404);
			break;
		}
	}
}
