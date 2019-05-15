package aiss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadMe
 */
public class ReadMe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadMe() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"es\" dir=\"ltr\">");
		out.println(" <head>\r\n" + 
				"    <meta charset=\"utf-8\">\r\n" + 
				"    <title>Descripcion Fitnassio</title>\r\n" + 
				"    <link rel=\"stylesheet\" type=\"text/css\" href=\"EstiloDescripcion.css\">\r\n" + 
				"  </head>\r\n" + 
				"  <body>\r\n" + 
				"\r\n" + 
				"    <h1>Fitnassio</h1>\r\n" + 
				"    <p> Fitnassio es una aplicación que surge con el objetivo de facilitar la experiencia\r\n" + 
				"        del ejercicio físico de los usuarios.\r\n" + 
				"        Nuestra aplicación sugiere tanto rutas interesantes para correr por las ciudades\r\n" + 
				"        como diferentes y personalizadas rutinas y ejercicios para mejorar la forma física\r\n" + 
				"        Además ofrece la posibilidad de consultar el clima y el observar el progreso.\r\n" + 
				"        (Algo sobre la nutrición)</p>\r\n" + 
				"\r\n" + 
				"  </body>\r\n" + 
				"</html>");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
