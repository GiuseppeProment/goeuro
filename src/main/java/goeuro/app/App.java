package goeuro.app;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public String getCitiesStartingWith(String cityName ) {
		RateProvider provider = new RateProvider();
		provider.searchInformationForCity( cityName );
		return null;
	}
}
