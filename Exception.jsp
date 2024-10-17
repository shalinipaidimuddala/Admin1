import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class guru_register
 */
public class guru_register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String first_name = request.getParameter("first_name");
		String last_name = request.getParamet"E:/practice/Method"E:/practice/MethodOverriding.java"Overloading.txt"er("last_name");
		String username = request.getParameter("username");
		String password = request.getParameter("password");"E:/practice/servlet.java"
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		"E:/practice/shadowing.java"
		if(first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() || 
				password.isEmpty() || address.isEmpty() || contact.isEmpty())
		{
			RequestDispatcher "E:/practice/String.java"req = request.getRequestDispatcher("register_1.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("register_2.jsp");
			req.forward(request, response);
		}
	}

}