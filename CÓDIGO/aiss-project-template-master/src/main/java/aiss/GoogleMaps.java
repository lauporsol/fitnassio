package aiss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GoogleMaps
 */
public class GoogleMaps extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoogleMaps() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  place = request.getParameter("place");
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<head><title>Embeded Map</title></head>");
		out.println("<body>");
		out.println("<iframe width='600' height='450' frameborder='0' style='border:0' src='https://www.google.com/maps/embed/v1/place?q="+place+"&key=AIzaSyDZoKEdcapvOACB9iE95Qnxi8vukkqmjDM' allowfullscreen></iframe>");
		out.println("<p>Mapa Localización.</p>");
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
