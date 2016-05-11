package goeuro.app;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jboss.weld.environment.se.bindings.Parameters;
import org.jboss.weld.environment.se.events.ContainerInitialized;

@ApplicationScoped
public class App {

	private static Logger LOG = LogManager.getLogger(App.class);

	@Inject
	CityInfoService cityInfoService;

	public App() {
	}

	public void applicationStart(@Observes ContainerInitialized event, @Parameters String[] parameters) {
		if (parameters.length == 0)
			System.out.println("Wrong use of program, you need informe the City Name.");
		else
			try {
				System.out.println(cityInfoService.getFirstCityStartingWith(parameters[0]));
			} catch (AplicationException e) {
				System.out.println(e.getMessage());
				LOG.error(e);
			}
	}

}
