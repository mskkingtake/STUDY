package designPatterns.factory.simpleFactory.car;

import designPatterns.factory.simpleFactory.Car;

public class Honda implements Car {

	@Override
	public void run() {
		System.out.println("现代汽车---跑");
	}
}
