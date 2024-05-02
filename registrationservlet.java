package firstWebApp;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class registrationservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public registrationservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String phno=request.getParameter("phno");
			String address=request.getParameter("address");
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String dateofbirth=request.getParameter("dob");
		String password=request.getParameter("password");
		System.out.println("done");
		user u1=new user();
		u1.setFirstname(firstname);
		u1.setLastname(lastname);
		u1.setPhnno(phno);
		u1.setAddress(address);
		u1.setDob(dateofbirth);
		u1.setPassword(password);
		paymentsappDAO pd=new paymentsappDAO();
		pd.insert(u1);
		System.out.println("done");
		RequestDispatcher rd= request.getRequestDispatcher("/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

