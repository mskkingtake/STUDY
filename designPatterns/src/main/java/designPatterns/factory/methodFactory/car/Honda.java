package designPatterns.factory.methodFactory.car;

import designPatterns.factory.methodFactory.Car;

public class Honda implements Car {

	@Override
	public void run() {
		System.out.println("现代汽车---跑");
	}
}
