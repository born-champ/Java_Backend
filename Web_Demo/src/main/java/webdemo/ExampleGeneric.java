package webdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class ExampleGeneric
 */
@WebServlet("/ExampleGeneric")
public class ExampleGeneric extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ExampleGeneric() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<body>");
		pw.print("<h1> Generic Example </h1>");
		pw.print("<p> hi everyone!! </p>");
		pw.print("</body>");
		pw.print("</html>");
		
	}

}
