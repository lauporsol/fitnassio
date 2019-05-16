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
import ipstack.Ipstack;

public class LocationController extends HttpServlet {
	
private static final long serialVersionUID = 1L;
    
	private static final Logger log = Logger.getLogger(WeatherController.class.getName());
	 
	public LocationController() {
		super();
	}
	
protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		
		RequestDispatcher rd = null;
		
		log.log(Level.FINE, "Searching for current Location");
		LocationResource location = new LocationResource();
		
		
		Ipstack result = location.getLocation();
		
		if (result!=null){
			request.setAttribute("loc", result.getCity());
			rd = request.getRequestDispatcher("/succesLocation.jsp");
					
		} else {
			log.log(Level.SEVERE, "Ipstack Object: " + result);
			rd = request.getRequestDispatcher("/error.jsp");
		}
		
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}
}
