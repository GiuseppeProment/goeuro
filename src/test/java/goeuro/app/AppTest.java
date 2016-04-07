package goeuro.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void testMain() {
		App theApp = new App();
		String citiesAsCvs = theApp.getCitiesStartingWith("Berlin");
		String expected = "376217,Berlin,location,52.52437,13.41053";
		assertEquals(expected, citiesAsCvs);
	}
}
