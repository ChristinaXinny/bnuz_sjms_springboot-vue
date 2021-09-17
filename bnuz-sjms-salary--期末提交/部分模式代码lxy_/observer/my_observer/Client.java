package lxy_.observer.my_observer;

public class Client {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		wd.getCurrentState();
		IBulletin bt = new CurrentBu();
		IBulletin bt1 = new AvgBu();
		wd.registerBulletin(bt);
		
		wd.registerBulletin(bt1);
		IBulletin bt2 = new OtherBu();
		wd.registerBulletin(bt2);
		wd.getCurrentState();
		
		wd.unRegisterBulletin(bt1);
		wd.getCurrentState();
		
	}

}
