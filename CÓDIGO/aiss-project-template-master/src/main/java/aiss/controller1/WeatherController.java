package aiss.controller1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import apixu.Apixu;


public class WeatherController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	private static final Logger log = Logger.getLogger(WeatherController.class.getName());
	 
	public WeatherController() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String  region = request.getParameter("region");
		RequestDispatcher rd = null;
		
		log.log(Level.FINE, "Searching for current wether in " + region);
		WeatherResource weather = new WeatherResource();
		
		
		Apixu result = weather.getCurrent(region);
		
		if (result!=null){
			rd = request.getRequestDispatcher("/success.jsp");
			request.setAttribute("current", result.getCurrent().getFeelslikeC());		
		} else {
			log.log(Level.SEVERE, "Apixu Objecct: " + result);
			rd = request.getRequestDispatcher("/error.jsp");
		}
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}

}
