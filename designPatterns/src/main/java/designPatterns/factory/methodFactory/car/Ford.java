package designPatterns.factory.methodFactory.car;

import designPatterns.factory.methodFactory.Car;

public class Ford implements Car {

	@Override
	public void run() {
		System.out.println("福特汽车---跑");
	}
}
