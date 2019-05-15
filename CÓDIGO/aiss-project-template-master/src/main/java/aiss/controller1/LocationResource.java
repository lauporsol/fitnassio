package aiss.controller1;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;


import ipstack.Ipstack;

public class LocationResource {
	
	private static final String APIXU_API_KEY = "d5136bedb8103ad7413d7d6886b75b76";  // TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(WeatherResource.class.getName());
	
	public Ipstack getLocation() throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String uri = "http://api.ipstack.com/193.147.173.146?access_key=" + APIXU_API_KEY ;
		log.log(Level.FINE, "Current ocation:" + uri);
		ClientResource cr = new ClientResource(uri);
		Ipstack result = cr.get(Ipstack.class);
		return result;
	}
}
