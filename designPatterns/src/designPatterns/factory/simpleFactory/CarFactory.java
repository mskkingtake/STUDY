package designPatterns.factory.simpleFactory;

import designPatterns.factory.simpleFactory.car.Bmw;
import designPatterns.factory.simpleFactory.car.Ford;
import designPatterns.factory.simpleFactory.car.Honda;

public class CarFactory {
	
	public static Car createCar(String type) {
		if("BMW".equals(type)) {
			return new Bmw();
		} else if("HONDA".equals(type)) {
			return new Honda();
		} else if("FORD".equals(type)) {
			return new Ford();
		} else {
			return null;
		}
	}
}
