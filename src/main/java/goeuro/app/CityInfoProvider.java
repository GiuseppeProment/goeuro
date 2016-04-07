package goeuro.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CityInfoProvider {
	private static Logger LOG = LogManager.getLogger(CityInfoProvider.class);

	private String readCityInfoFromInternet( String cityName ) {
		LOG.debug("reading city info from internet...");
		String input = "";
		try {
			URL myurl = new URL("http://api.goeuro.com/api/v2/position/suggest/en/"+cityName);
			HttpURLConnection con = (HttpURLConnection) myurl.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				input += line;
			};
			in.close();
		} catch (IOException e) {
			LOG.error(e, e);
			String msg = String.format("Error reading data from internet, please call suport the root cause is '%s'", e.getMessage());
			throw new RuntimeException(msg);
		}
		return input;
	}
	
	public String convertJsonToCvs(String input) throws AplicationException {
		JsonReader reader = Json.createReader(new StringReader(input));
		JsonArray cities = reader.readArray();
		if ( cities.isEmpty() )
			throw new AplicationException("The city searched can not be found");
		JsonObject city = cities.getJsonObject(0);
		JsonObject geoPosition = city.getJsonObject("geo_position");
		StringBuffer cvs = new StringBuffer();
		cvs.append(city.get("_id"));
		cvs.append(',');
		cvs.append(city.get("name"));
		cvs.append(',');
		cvs.append(city.get("type"));
		cvs.append(',');
		cvs.append(geoPosition.get("latitude"));
		cvs.append(',');
		cvs.append(geoPosition.get("longitude"));
		cvs.append( System.lineSeparator() );
		return cvs.toString();
	}

	public String searchInformationForCity(String cityName) throws AplicationException {
		String json = readCityInfoFromInternet(cityName);
		return convertJsonToCvs(json);
	}
}
