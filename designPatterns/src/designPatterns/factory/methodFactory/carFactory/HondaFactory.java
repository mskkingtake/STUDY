package designPatterns.factory.methodFactory.carFactory;

import designPatterns.factory.methodFactory.Car;
import designPatterns.factory.methodFactory.CarFactory;
import designPatterns.factory.methodFactory.car.Honda;

public class HondaFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Honda();
	}
}
