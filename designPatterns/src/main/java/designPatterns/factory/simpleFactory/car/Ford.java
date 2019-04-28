package designPatterns.factory.simpleFactory.car;

import designPatterns.factory.simpleFactory.Car;

public class Ford implements Car {

	@Override
	public void run() {
		System.out.println("福特汽车---跑");
	}
}
