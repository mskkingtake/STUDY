package designPatterns.factory.simpleFactory.car;

import designPatterns.factory.simpleFactory.Car;

public class Bmw implements Car {

	@Override
	public void run() {
		System.out.println("宝马汽车---跑");
	}
}
