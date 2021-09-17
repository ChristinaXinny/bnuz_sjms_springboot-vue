package lxy_.observer.my_observer;

import java.util.List;
import java.util.Random;

public class WeatherData {
	private double temperature;
	private double humdity;
	private double pressure;
	private List<IBulletin> iBulletins;
	public void getCurrentState() {
		temperature = new Random().nextDouble();
		humdity = new Random().nextDouble();
		pressure = new Random().nextDouble();
		notifyBulletins();
	}

	private void notifyBulletins() {
		for (IBulletin bt:iBulletins) {
			bt.update(temperature,humdity,pressure);
		}
	}

	public void registerBulletin(IBulletin bt) {
		iBulletins.add(bt);
	}

	public void unRegisterBulletin(IBulletin bt1) {
		iBulletins.remove(bt1);
	}

}
