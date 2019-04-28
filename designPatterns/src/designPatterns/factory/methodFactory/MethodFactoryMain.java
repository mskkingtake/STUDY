package designPatterns.factory.methodFactory;

import designPatterns.factory.methodFactory.carFactory.HondaFactory;

public class MethodFactoryMain {

	/**
	 * ��������
	 * @param args
	 */
	public static void main(String[] args) {
		CarFactory CarFactory = new HondaFactory();
		Car car = CarFactory.createCar();
		car.run();
	}
}
