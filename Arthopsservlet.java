package exampleservletprogram;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Arthopsservlet
 */
@WebServlet("/Arthopsservlet")
public class Arthopsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Arthopsservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int result;
	String a = request.getParameter("num1");
	 String s=request.getParameter("operator");
	String b = request.getParameter("num2");
	int i= Integer.parseInt(a);
	int j= Integer.parseInt(b);
	char ch=s.charAt(0);
	switch(ch) {
	case '+':
		result=i+j;
		response.getWriter().write("sum of " + i +" and "+ j + " is "+ result);
		break;
	case '-':
		result=i-j;
		response.getWriter().write("Difference of " + i +" and "+ j + " is "+ result);
		break;
	case '*':
		result=i*j;
		response.getWriter().write("mul of " + i +" and "+ j + " is "+ result);
		break;
	case '/':
		result=i/j;
		response.getWriter().write("division of " + i +" and "+ j + " is "+ result);
		break;
		
		
	}
	
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
