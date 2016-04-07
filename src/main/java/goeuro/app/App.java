package goeuro.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static Logger LOG = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		if ( args.length == 0 )
			System.out.println("Wrong use of program, you need informe the City Name.");
		else
			try {
				System.out.println(new CityInfoService().getFirstCityStartingWith(args[0]));
			} catch (AplicationException e) {
				System.out.println(e.getMessage());
				LOG.error(e);
			}
	}
}
