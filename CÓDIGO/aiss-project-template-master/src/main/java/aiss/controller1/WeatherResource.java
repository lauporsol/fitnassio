package aiss.controller1;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.resource.ClientResource;

import apixu.Apixu;


public class WeatherResource {
	
	private static final String APIXU_API_KEY = "a85cf09375be406a91e113752190304";  // TODO: Change this API KEY for your personal Key
	private static final Logger log = Logger.getLogger(WeatherResource.class.getName());
	

	public Apixu getCurrent(String region) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String region1 = URLEncoder.encode(region, "UTF-8");
		String uri = "http://api.apixu.com/v1/currennt.json?key=" + APIXU_API_KEY + "&q=" + region1;
		log.log(Level.FINE, "Current weather:" + uri);
		ClientResource cr = new ClientResource(uri);
		Apixu result = cr.get(Apixu.class);
		return result;
	}
}
