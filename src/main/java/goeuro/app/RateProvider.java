package goeuro.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.net.ssl.HttpsURLConnection;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RateProvider {
	private static Logger LOG = LogManager.getLogger(RateProvider.class);

	String searchRateFor(String currency, String input) {
		JsonReader reader = Json.createReader(new StringReader(input));
		JsonObject rates = reader.readObject().getJsonObject("rates");
		if (rates.containsKey(currency)) {
			JsonValue value = rates.get(currency);
			return Json.createObjectBuilder()
					.add("records",
							Json.createArrayBuilder().add(
									Json.createObjectBuilder().add("currency", currency).add("value", value).build()))
					.build().toString();
		}
		return "";
	}

	private String readCityInfoFromInternet( String cityName ) {
		LOG.info("reading city info from internet...");
		String input = "";
		try {
			URL myurl = new URL("http://api.goeuro.com/api/v2/position/suggest/en/"+cityName);
			HttpsURLConnection con = (HttpsURLConnection) myurl.openConnection();
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

	public String convertJsonToCvs(String input) {
		JsonReader reader = Json.createReader(new StringReader(input));
		JsonObject rates = reader.readObject().getJsonObject("rates");
//		if (rates.containsKey(currency)) {
//			JsonValue value = rates.get(currency);
//			return Json.createObjectBuilder()
//					.add("records",
//							Json.createArrayBuilder().add(
//									Json.createObjectBuilder().add("currency", currency).add("value", value).build()))
//					.build().toString();
//		}
		return "";
	}

	public String searchInformationForCity(String cityName) {
		String json = readCityInfoFromInternet(cityName);
		return convertJsonToCvs(json);
	}
}
