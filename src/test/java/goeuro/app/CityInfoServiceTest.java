package goeuro.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityInfoServiceTest {

	@Test
	public void getCitiesStartingWith() {
		CityInfoService service = new CityInfoService();
		String citiesAsCvs = service.getCitiesStartingWith("Berlin");
		String expected = "376217,Berlin,location,52.52437,13.41053";
		assertEquals(expected, citiesAsCvs);
	}

}
