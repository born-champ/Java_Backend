package webdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExample
 */
@WebServlet("/ServletExample")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        //response.getWriter().append("Served at: ").append(request.getContextPath());
        PrintWriter out = response.getWriter();
        String Login =request.getParameter("loginid");
        String password =request.getParameter("password") ;
        out.println(" Your login ID is :");
        out.println(Login);
        out.println("Your password is :");
        out.println(password);
        out.close();
	}*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  PrintWriter o1 = res.getWriter();
		    String Log = req.getParameter("loginid");
		    String pass = req.getParameter("password");
		    o1.println(" Login ID is --> ");
		    o1.println(Log);
		    o1.println(" Pass word is --> ");
		    o1.println(pass);
		    o1.close();
	}

}
