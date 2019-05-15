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

public class GetStartedController extends HttpServlet{
	
private static final long serialVersionUID = 1L;
    
	private static final Logger log = Logger.getLogger(WeatherController.class.getName());
	 
	public GetStartedController() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		String  button = request.getParameter("button");
		RequestDispatcher rd = null;
		
		log.log(Level.FINE, "Searching for current Location");
		LocationResource location = new LocationResource();
		
		if("button".equals(button)) {
			
			String ciudad = location.getLocation().getCity();
			
			WeatherResource weather = new WeatherResource();
			Apixu result = weather.getCurrent(ciudad);
			
			if (ciudad!=null || result!=null){
				rd = request.getRequestDispatcher("vista perfil");
				request.setAttribute("current", result.getCurrent().getFeelslikeC());	
				request.setAttribute("region", ciudad);
			} else {
				log.log(Level.SEVERE, "Apixu Objecct: " + result);
				rd = request.getRequestDispatcher("vista error");
			}
		}
		
		
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}
	
}
