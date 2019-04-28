package designPatterns.factory.abstractFactory;

import designPatterns.factory.abstractFactory.carFactory.CarFactoryLevel1;

public class AbstractFactoryMain {

	/**
	 * ³éÏó¹¤³§
	 * @param args
	 */
	public static void main(String[] args) {
		CarFactory CarFactory = new CarFactoryLevel1();
		
		Engine engine = CarFactory.createEngine();
		engine.run();
		
		Seat seat = CarFactory.createSeat();
		seat.massage();
		
		Tyre tyre = CarFactory.createTyre();
		tyre.motion();
	}
}
