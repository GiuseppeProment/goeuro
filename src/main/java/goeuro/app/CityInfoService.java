package goeuro.app;

public class CityInfoService {

	private CityInfoProvider provider;

	public CityInfoService() {
		super();
		provider = new CityInfoProvider();
	}

	public String getFirstCityStartingWith(String cityName) throws AplicationException {
		return provider.searchInformationForCity( cityName );
	}

}