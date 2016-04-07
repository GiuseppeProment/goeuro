package goeuro.app;

public class App {
	public static void main(String[] args) {
		System.out.println(new CityInfoService().getCitiesStartingWith(args[0]));
	}
}
