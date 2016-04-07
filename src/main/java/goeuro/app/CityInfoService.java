package goeuro.app;

public class CityInfoService {

	private CityInfoProvider cityInfoProvider;

	public CityInfoService(CityInfoProvider cityInfoProvider) {
		super();
		this.cityInfoProvider = cityInfoProvider;
	}

	public String getFirstCityStartingWith(String cityName) throws AplicationException {
		return cityInfoProvider.searchInformationForCity( cityName );
	}

}