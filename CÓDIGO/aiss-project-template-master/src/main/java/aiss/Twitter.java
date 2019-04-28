package aiss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Twitter
 */
public class Twitter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Twitter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<html>");
		out.println("<head><title>Descripcion de la aplicacion:</title></head>");
		out.println("<body>");
		out.println("<a class=\"twitter-timeline\" href=\"https://twitter.com/TwitterDev?ref_src=twsrc%5Etfw\">Tweets by TwitterDev</a> <script async src=\"https://platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>");
		out.println("<p>Inroducir descripción.</p>");
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
