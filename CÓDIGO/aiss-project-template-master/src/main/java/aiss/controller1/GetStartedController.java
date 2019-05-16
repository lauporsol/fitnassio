package aiss.controller1;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GoogleMapsSearch.Result;
import apixu.Apixu;

public class GetStartedController extends HttpServlet{
	
private static final long serialVersionUID = 1L;
    
	private static final Logger log = Logger.getLogger(WeatherController.class.getName());
	 
	public GetStartedController() {
		super();
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		

		RequestDispatcher rd = null;
		
		log.log(Level.FINE, "Searching for current Location");
		
		LocationResource location = new LocationResource();	
		String ciudad = location.getLocation().getCity();
		Double latitud = location.getLocation().getLatitude();
		Double longitud = location.getLocation().getLongitude();
		
		WeatherResource weather = new WeatherResource();
		Double current = weather.getCurrent(ciudad).getCurrent().getFeelslikeC();
		Double wind = weather.getCurrent(ciudad).getCurrent().getWindKph();
		String tiempoAt = weather.getCurrent(ciudad).getCurrent().getCondition().getText();
		String urlImagen = weather.getCurrent(ciudad).getCurrent().getCondition().getIcon();
		
		MapResource search = new MapResource();
		List<Result> places = search.getPlaces(latitud, longitud).getResults();
		
			
		if (ciudad!=null || current!=null){
		request.setAttribute("region", ciudad);
		request.setAttribute("current", current);	
		request.setAttribute("wind", wind);
		request.setAttribute("timepoAt", tiempoAt);
		request.setAttribute("urlImagen", urlImagen);
		request.setAttribute("latitud", latitud);
		request.setAttribute("longitud", longitud);
		request.setAttribute("places", places);
		rd = request.getRequestDispatcher("vista perfil");

		} else {
			log.log(Level.SEVERE, "Apixu Object: " + current);
			rd = request.getRequestDispatcher("vista error");
		}
		
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		doGet(request, response);
	}
	
}
