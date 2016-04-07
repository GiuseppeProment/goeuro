package goeuro.app;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class CityInfoServiceAcceptTest {

	/* actually this is a accept test, a kind of end-to-end test, isnt a unit test and its here for sake of simplicity*/
	@Test
	@Ignore /* must be run on the continous integration server only*/
	public void getCitiesStartingWith() throws Exception {
		CityInfoProvider cityInfoProvider = new CityInfoProvider();
		CityInfoService service = new CityInfoService(cityInfoProvider);
		String citiesAsCvs = service.getFirstCityStartingWith("Berlin");
		String expected = "376217,\"Berlin\",\"location\",52.52437,13.41053"+System.lineSeparator();
		assertEquals(expected, citiesAsCvs);
	}

}
