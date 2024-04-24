package servletapplication;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/wepservlet")
public class wepservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public wepservlet() {
        super();
       
    }

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AppWebDAO dao = new AppWebDAO();
        ResultSet rs = dao.getAllUsers();

       // request.setAttribute("userResultSet", rs); 

        
        System.out.println(rs);
		
	}

	
	protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		int password=Integer.parseInt(request.getParameter("pwd"));
		AppWebDAO dao=new AppWebDAO();
		dao.insertUser("username",password);
        request.getRequestDispatcher("NewFile.html").forward(request, response);

	}

}
