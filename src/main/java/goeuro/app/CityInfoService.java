package goeuro.app;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class CityInfoService {

	@Inject
	private CityInfoProvider cityInfoProvider;
	
	public CityInfoService() {
	}

	public CityInfoService(CityInfoProvider cityInfoProvider) {
		super();
		this.cityInfoProvider = cityInfoProvider;
	}

	public String getFirstCityStartingWith(String cityName) throws AplicationException {
		return cityInfoProvider.searchInformationForCity( cityName );
	}

}