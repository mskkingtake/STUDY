package designPatterns.factory.methodFactory.car;

import designPatterns.factory.methodFactory.Car;

public class Bmw implements Car {

	@Override
	public void run() {
		System.out.println("宝马汽车---跑");
	}
}
