package designPatterns.factory.simpleFactory;

public class SimpleFactoryMain {

	/**
	 * �򵥹���
	 * @param args
	 */
	public static void main(String[] args) {
		Car car = CarFactory.createCar("HONDA");
		car.run();
	}
}
