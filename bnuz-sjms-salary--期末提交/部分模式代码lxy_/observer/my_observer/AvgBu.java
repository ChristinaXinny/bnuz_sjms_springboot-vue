package lxy_.observer.my_observer;

import java.util.List;

public class AvgBu implements IBulletin {
    private List<Double> temperatures;
	@Override
	public void update(double temperature, double humdity, double pressure) {
		temperatures.add(temperature);
		
	}

}
