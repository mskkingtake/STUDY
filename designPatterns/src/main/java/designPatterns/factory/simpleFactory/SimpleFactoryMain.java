package designPatterns.factory.simpleFactory;

public class SimpleFactoryMain {

	/**
	 * 简单工厂
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = CarFactory.createCar("HONDA");
		car.run();
	}
}
