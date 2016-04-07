package goeuro.app;

public class CityInfoService {

	private CityInfoProvider provider;

	public CityInfoService() {
		super();
		provider = new CityInfoProvider();
	}

	public String getCitiesStartingWith(String cityName) {
		return provider.searchInformationForCity( cityName );
	}

}